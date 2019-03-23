package com.example.demo.configuration;

import com.example.demo.kafka.KafkaConsumerListener;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.*;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.listener.config.ContainerProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * kafka本地化配置
 * @author admin
 */
@Configuration
public class SpringKafkaConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(SpringKafkaConfiguration.class);

    @Value("${spring.kafka.consumer.servers=127.0.0.1:8888}")
    private String bootstrapServers;

    @Value("${spring.kafka.consumer.servers=127.0.0.1:8888}")
    private String producerServers;

    @Value("${spring.kafka.producer.key.serializer.class:org.apache.kafka.common.serialization.StringSerializer}")
    private String producerKeySerializerClass;

    @Value("${spring.kafka.producer.value.serializer.class:org.apache.kafka.common.serialization.StringSerializer}")
    private String producerValueSerializerClass;


    @Value("${spring.kafka.producer.batch.size:200}")
    private int batchSize;

    @Value("${spring.kafka.producer.buffer.memory:33554432}")
    private int bufferMemory;

    @Value("${spring.kafka.producer.request.timeout.ms:30000}")
    private int producerRequestTimeoutMs;

    @Value("${spring.kafka.producer.retries:0}")
    private int retries;

    @Value("${spring.kafka.producer.linger.ms:1}")
    private int lingerMs;

    @Value("${spring.kafka.consumer.request.timeout.ms:30000}")
    private int consumerRequestTimeoutMs;
    @Value("${spring.kafka.consumer.concurrency.size:1}")
    private int concurrencySize;
    @Value("#{\'${spring.kafka.consumer.listener.topics}\'.split(\',\')}")
    private String[] topics;
    @Value("${spring.kafka.consumer.session.timeout.ms:15000}")
    private String sessionTimeoutMs;
    @Value("${spring.kafka.consumer.enable.auto.commit:true}")
    private boolean enableAutoCommit;
    @Value("${spring.kafka.consumer.auto.commit.interval.ms:500}")
    private String autoCommitIntervalMs;
    @Value("${test-h}")
    private String clientId;
    @Value("${test-h}")
    private String consumerKeySerializerClass;
    @Value("${test-h}")
    private String consumerValueSerializerClass;
    @Value("${test-h}")
    private String groupId;

    @Autowired
    private KafkaConsumerListener springKafkaConsumerListener;

//    @Bean
    @ConditionalOnMissingBean
    public ConsumerFactory<String, Object> consumerFactory() {
        return new DefaultKafkaConsumerFactory(this.consumerConfigs());
    }

    @Bean
    public Map<String, Object> consumerConfigs() {
        HashMap props = new HashMap();
        props.put("bootstrap.servers", this.bootstrapServers);
        props.put("group.id", this.groupId);
        props.put("enable.auto.commit", enableAutoCommit);
        props.put("auto.commit.interval.ms", this.autoCommitIntervalMs);
        props.put("session.timeout.ms", this.sessionTimeoutMs);
        props.put("key.deserializer", this.consumerKeySerializerClass);
        props.put("value.deserializer", this.consumerValueSerializerClass);
        props.put("client.id", this.clientId);
        return props;
    }

    @Bean
    public ContainerProperties containerProperties() {
        logger.info("load listener topics :{}", this.topics.toString());
        ContainerProperties containerProperties = new ContainerProperties(this.topics);
        containerProperties.setMessageListener(springKafkaConsumerListener);
        return containerProperties;
    }

    @Bean
    public ConcurrentMessageListenerContainer<String, Object> concurrentMessageListenerContainer() {
        ConcurrentMessageListenerContainer factory = new ConcurrentMessageListenerContainer(this.consumerFactory(), this.containerProperties());
        factory.setConcurrency(this.concurrencySize);
        factory.getContainerProperties().setPollTimeout(this.consumerRequestTimeoutMs);
        return factory;
    }

    @Bean
    public ProducerFactory<String, Object> producerFactory() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public Map<String, Object> producerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, producerServers);
        props.put(ProducerConfig.RETRIES_CONFIG, retries);
        props.put(ProducerConfig.BATCH_SIZE_CONFIG, batchSize);
        props.put(ProducerConfig.LINGER_MS_CONFIG, lingerMs);
        props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, bufferMemory);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, producerKeySerializerClass);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, producerValueSerializerClass);
        props.put(ProducerConfig.REQUEST_TIMEOUT_MS_CONFIG, producerRequestTimeoutMs);
        return props;
    }

    @Bean
    public KafkaTemplate<String, Object> kafkaTemplate() {
        return new KafkaTemplate<String, Object>(producerFactory());
    }

}
