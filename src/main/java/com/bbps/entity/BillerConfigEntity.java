package com.bbps.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "c_biller_details",schema="bbps")
@AllArgsConstructor
@NoArgsConstructor
public class BillerConfigEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "blr_id")
    private String billerId;

    @Column(name = "blr_category_name")
    private String billlerCategoryName;

    @Column(name = "blr_name")
    private String blrName;

    @Column(name = "blr_deails")
    private String billerDetails;

    @Column(name = "created")
    private String created;

    @Column(name = "createddatetime")
    private Timestamp  createdDateTime;

    @Column(name = "status")
    private String status;

}
