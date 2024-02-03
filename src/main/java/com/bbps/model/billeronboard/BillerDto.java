package com.bbps.model.billeronboard;

import lombok.Data;

@Data
public class BillerDto {

    private String blr_id;
    private String blr_name;
    private String blr_alias_name;
    private String blr_category_name;
    private String blr_linked_ou_default;
    private String DirectTSP;
    private String LogoAttached;
    private String blr_pmt_amt_exactness;
    private String fetch_requirement;
    private String support_validation_api;
    private String blr_description;
    private String enable_reversal_elimination;
    private String support_402_api_flag;
    private String blr_timeout;
    private String blr_retry_interval_402	;
    private String support_credit_adjustment_flag;
    private String blr_tat_for_stp;
    private String blr_ca_velocity_percentage;
    private String blr_linked_ou_backup_1;
    private String blr_linked_ou_backup_2;
    private String blr_linked_ou_backup_3;
    private String parent_blr_id;
    private String is_parent_blr	;
    private String blr_registered_adrline;
    private String blr_registered_city;
    private String blr_registered_pin_code;
    private String blr_registered_state;
    private String blr_registered_country;
    private String blr_commumication_adrline;
    private String blr_commumication_city;
    private String blr_commumication_pin_code;
    private String blr_commumication_state;
    private String blr_commumication_country;
    private String blr_mode;
    private String blr_accepts_adhoc;
    private String blr_ownership;
    private String blr_auth_letter_1;
    private String blr_auth_letter_1_nm;
    private String blr_auth_letter_2;
    private String blr_auth_letter_2_nm;
    private String blr_auth_letter_3;
    private String blr_auth_letter_3_nm;
    private String blr_avg_ticket_size;
    private String blr_volume_per_day;
    private String blr_coverage;
    private String blr_payment_modes;
    private String blr_payment_channels;
    private String blr_payment_modes_402;
    private String blr_payment_channels_402;
    private String blr_effctv_from;
    private String blr_effctv_to;
    private String blr_tan;
    private String blr_uaadhaar;
    private String blr_roc_uin;
    private String blr_customer_params;
    private String blr_response_params	;
    private String blr_additional_info;
    private String entity_status	;
    private String fetch_ageing	;
    private String blr_cust_param_group;



}
