package com.example.demo.Entity;

import java.sql.Timestamp;

/**
 * Created by jiangbin on 2019/6/23.
 */
public class TYgTjbbCjysb {
    private String id;

    /**
     * 报表级别（1-点位，2-地区，3-汇总）
     */
    private String bbjb;

    /**
     * 点位ID
     */
    private String dwId;

    /**
     * 点位编号
     */
    private String dwbh;

    /**
     * 点位所属地区的行政区划代码
     */
    private String ssdq;

    /**
     * 报表周期类型（1-日报，2-月报）
     */
    private String bblx;

    /**
     * 报表周期，对日报指日报日期，对月报指当月第一天的日期
     */
    private Timestamp bbrq;

    /**
     * 统计时间，即统计报表生成时间
     */
    private Timestamp tjsj;

    /**
     * 本期采集遥感数据量
     */
    private Long bqcjygsjl;

    /**
     * 本期采集遥感有效数据量
     */
    private Long bqcjygyxsjl;

    /**
     * 本期采集黑烟数据量
     */
    private Long bqcjhysjl;

    /**
     * 本期采集黑烟有效数据量
     */
    private Long bqcjhyyxsjl;

    /**
     * 本期采集最小遥感监测时间，即本期采集的遥感数据中最小的监测时间
     */
    private Timestamp bqcjzxygjcsj;

    /**
     * 本期采集最大遥感监测时间，即本期采集的遥感数据中最大的监测时间
     */
    private Timestamp bqcjzdygjcsj;

    /**
     * 本期采集最小黑烟监测时间，即本期采集的黑烟数据中最小的监测时间
     */
    private Timestamp bqcjzxhyjcsj;

    /**
     * 本期采集最大黑烟监测时间，即本期采集的黑烟数据中最大的监测时间
     */
    private Timestamp bqcjzdhyjcsj;

    /**
     * 累计采集遥感数据量
     */
    private Long ljcjygsjl;

    /**
     * 累计采集遥感有效数据量
     */
    private Long ljcjygyxsjl;

    /**
     * 累计采集黑烟数据量
     */
    private Long ljcjhysjl;

    /**
     * 累计采集黑烟有效数据量
     */
    private Long ljcjhyyxsjl;

    /**
     * 本期上报遥感数据量
     */
    private Long bqsbygsjl;

    /**
     * 本期上报黑烟数据量
     */
    private Long bqsbhysjl;

    /**
     * 本期上报数据总量（遥感+黑烟）
     */
    private Long bqsbsjzl;

    /**
     * 累计上报遥感数据量
     */
    private Long ljsbygsjl;

    /**
     * 累计上报黑烟数据量
     */
    private Long ljsbhysjl;

    /**
     * 累计上报数据总量（遥感+黑烟）
     */
    private Long ljsbsjzl;

    /**
     * 本期遥感数据上报量（本期采集且本期上报）
     */
    private Long bqygsjsbl;

    /**
     * 本期黑烟数据上报量（本期采集且本期上报）
     */
    private Long bqhysjsbl;

    /**
     * 本期数据上报总量（本期采集且本期上报，遥感+黑烟）
     */
    private Long bqsjsbzl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBbjb() {
        return bbjb;
    }

    public void setBbjb(String bbjb) {
        this.bbjb = bbjb;
    }

    public String getDwId() {
        return dwId;
    }

    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    public String getDwbh() {
        return dwbh;
    }

    public void setDwbh(String dwbh) {
        this.dwbh = dwbh;
    }

    public String getSsdq() {
        return ssdq;
    }

    public void setSsdq(String ssdq) {
        this.ssdq = ssdq;
    }

    public String getBblx() {
        return bblx;
    }

    public void setBblx(String bblx) {
        this.bblx = bblx;
    }

    public Timestamp getBbrq() {
        return bbrq;
    }

    public void setBbrq(Timestamp bbrq) {
        this.bbrq = bbrq;
    }

    public Timestamp getTjsj() {
        return tjsj;
    }

    public void setTjsj(Timestamp tjsj) {
        this.tjsj = tjsj;
    }

    public Long getBqcjygsjl() {
        return bqcjygsjl;
    }

    public void setBqcjygsjl(Long bqcjygsjl) {
        this.bqcjygsjl = bqcjygsjl;
    }

    public Long getBqcjygyxsjl() {
        return bqcjygyxsjl;
    }

    public void setBqcjygyxsjl(Long bqcjygyxsjl) {
        this.bqcjygyxsjl = bqcjygyxsjl;
    }

    public Long getBqcjhysjl() {
        return bqcjhysjl;
    }

    public void setBqcjhysjl(Long bqcjhysjl) {
        this.bqcjhysjl = bqcjhysjl;
    }

    public Long getBqcjhyyxsjl() {
        return bqcjhyyxsjl;
    }

    public void setBqcjhyyxsjl(Long bqcjhyyxsjl) {
        this.bqcjhyyxsjl = bqcjhyyxsjl;
    }

    public Timestamp getBqcjzxygjcsj() {
        return bqcjzxygjcsj;
    }

    public void setBqcjzxygjcsj(Timestamp bqcjzxygjcsj) {
        this.bqcjzxygjcsj = bqcjzxygjcsj;
    }

    public Timestamp getBqcjzdygjcsj() {
        return bqcjzdygjcsj;
    }

    public void setBqcjzdygjcsj(Timestamp bqcjzdygjcsj) {
        this.bqcjzdygjcsj = bqcjzdygjcsj;
    }

    public Timestamp getBqcjzxhyjcsj() {
        return bqcjzxhyjcsj;
    }

    public void setBqcjzxhyjcsj(Timestamp bqcjzxhyjcsj) {
        this.bqcjzxhyjcsj = bqcjzxhyjcsj;
    }

    public Timestamp getBqcjzdhyjcsj() {
        return bqcjzdhyjcsj;
    }

    public void setBqcjzdhyjcsj(Timestamp bqcjzdhyjcsj) {
        this.bqcjzdhyjcsj = bqcjzdhyjcsj;
    }

    public Long getLjcjygsjl() {
        return ljcjygsjl;
    }

    public void setLjcjygsjl(Long ljcjygsjl) {
        this.ljcjygsjl = ljcjygsjl;
    }

    public Long getLjcjygyxsjl() {
        return ljcjygyxsjl;
    }

    public void setLjcjygyxsjl(Long ljcjygyxsjl) {
        this.ljcjygyxsjl = ljcjygyxsjl;
    }

    public Long getLjcjhysjl() {
        return ljcjhysjl;
    }

    public void setLjcjhysjl(Long ljcjhysjl) {
        this.ljcjhysjl = ljcjhysjl;
    }

    public Long getLjcjhyyxsjl() {
        return ljcjhyyxsjl;
    }

    public void setLjcjhyyxsjl(Long ljcjhyyxsjl) {
        this.ljcjhyyxsjl = ljcjhyyxsjl;
    }

    public Long getBqsbygsjl() {
        return bqsbygsjl;
    }

    public void setBqsbygsjl(Long bqsbygsjl) {
        this.bqsbygsjl = bqsbygsjl;
    }

    public Long getBqsbhysjl() {
        return bqsbhysjl;
    }

    public void setBqsbhysjl(Long bqsbhysjl) {
        this.bqsbhysjl = bqsbhysjl;
    }

    public Long getBqsbsjzl() {
        return bqsbsjzl;
    }

    public void setBqsbsjzl(Long bqsbsjzl) {
        this.bqsbsjzl = bqsbsjzl;
    }

    public Long getLjsbygsjl() {
        return ljsbygsjl;
    }

    public void setLjsbygsjl(Long ljsbygsjl) {
        this.ljsbygsjl = ljsbygsjl;
    }

    public Long getLjsbhysjl() {
        return ljsbhysjl;
    }

    public void setLjsbhysjl(Long ljsbhysjl) {
        this.ljsbhysjl = ljsbhysjl;
    }

    public Long getLjsbsjzl() {
        return ljsbsjzl;
    }

    public void setLjsbsjzl(Long ljsbsjzl) {
        this.ljsbsjzl = ljsbsjzl;
    }

    public Long getBqygsjsbl() {
        return bqygsjsbl;
    }

    public void setBqygsjsbl(Long bqygsjsbl) {
        this.bqygsjsbl = bqygsjsbl;
    }

    public Long getBqhysjsbl() {
        return bqhysjsbl;
    }

    public void setBqhysjsbl(Long bqhysjsbl) {
        this.bqhysjsbl = bqhysjsbl;
    }

    public Long getBqsjsbzl() {
        return bqsjsbzl;
    }

    public void setBqsjsbzl(Long bqsjsbzl) {
        this.bqsjsbzl = bqsjsbzl;
    }
}
