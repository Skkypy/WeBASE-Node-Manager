/**
 * Copyright 2014-2021 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webank.webase.node.mgr.deploy.entity;

import java.util.Date;

import com.webank.webase.node.mgr.base.enums.HostStatusEnum;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class TbHost {

    public static TbHost init(
                               String ip,
                               String rootDir,
                               HostStatusEnum hostStatusEnum,
                               String remark
                              ){
        Date now = new Date();
        TbHost tbHost = new TbHost();
        tbHost.setIp(ip);
        tbHost.setRootDir(rootDir);
        tbHost.setStatus(hostStatusEnum.getId());
        tbHost.setRemark(remark);
        tbHost.setCreateTime(now);
        tbHost.setModifyTime(now);
        return tbHost;
    }
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_host.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_host.ip
     *
     * @mbg.generated
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_host.root_dir
     *
     * @mbg.generated
     */
    private String rootDir;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_host.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_host.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_host.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_host.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;
}