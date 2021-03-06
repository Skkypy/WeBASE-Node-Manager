package com.webank.webase.node.mgr.contract.warehouse.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class TbContractFolder implements Serializable {

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_contract_folder.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_contract_folder.folder_name
     *
     * @mbg.generated
     */
    private String folderName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_contract_folder.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_contract_folder.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_contract_folder.warehouse_id
     *
     * @mbg.generated
     */
    private Integer warehouseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_contract_folder.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_contract_folder.description_en
     *
     * @mbg.generated
     */
    private String descriptionEn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_contract_folder.folder_detail
     *
     * @mbg.generated
     */
    private String folderDetail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_contract_folder.folder_detail_en
     *
     * @mbg.generated
     */
    private String folderDetailEn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_contract_folder
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}
