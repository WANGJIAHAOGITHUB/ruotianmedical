drop database if exists  ruotianmedical_db;
create database ruotianmedical_db character set utf8mb4;
use ruotianmedical_db;


### 创建病例概要数据信息主表
drop table if exists emr_summary_clinc;
create table emr_summary_clinc(
    id varchar(100) not null comment '主键',
    documentId varchar(100) not null default '病例概要' comment '文档标识-名称',
    documentCode varchar(100) comment '文档标识-类别代码',
    documentOrganizationName varchar(100) not null comment '文档标识-管理机构名称',
    documentOrganizationCode varchar(100) comment '文档标识-管理机构代码',
    documentNumber varchar(100) comment '文档标识-号码',
    documentEffectiveDate datetime not null comment '文档标识-生效日期',
    documentExpiryDate datetime comment '文档标识-失效日期',
    identName varchar(100) not null comment '姓名-标识对象',
    identNameCode varchar(100) comment '姓名-标识对象代码',
    name varchar(100) not null comment '姓名',
    patientTypeCode varchar(100) comment '病人类型代码',
    ABOBloodType varchar(100) comment 'ABO血型',
    RHBloodType varchar(100) comment 'RH血型',
    riskIdentityName varchar(100) comment '危险标识名称',
    riskIdentityCode varchar(100) comment '危险标识代码',
    larithmicsGenderCode varchar(10) not null comment '人口学性别代码',
    larithmicsAge varchar(100) not null comment '年龄(岁)',
    nationCode varchar(100) comment '民族代码',
    marriageCode varchar(100) not null comment '婚姻状况代码',
    birthday date not null comment '出生日期',
    birthplace varchar(100) comment '出生地',
    province varchar(100) not null comment '省',
    city varchar(100) not null comment '市',
    county varchar(100) not null comment '县',
    village varchar(100) not null comment '乡',
    hamlet varchar(100) not null comment '村',
    houseNumber varchar(100) not null comment '门牌号码',
    postalCode varchar(100) not null comment '邮政编码',
    administrative varchar(100) comment '行政区划代码 0-*',
    orgName varchar(100) not null comment '机构名称',
    orgNameCode varchar(100) not null comment '机构名称代码',
    orgCharge varchar(100) comment '机构负责人',
    orgAddress varchar(100) comment '机构地址',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='门急诊数据信息表';

### 电子病例-病例概要-服务对象标识信息表
drop table if exists emr_summary_patient;
create table emr_summary_patient(
    id varchar(100) not null comment '主键',
    emr_summary_id varchar(100) not null comment '病例概要数据信息表主键',
    identNumberTypeCode varchar(100) not null comment '标识号-类别代码',
    identNumber varchar(100) not null comment '标识号-号码*',
    identNumberEffectiveDate datetime not null comment '标识号-生效日期',
    identNumberExpiryDate datetime comment '标识号-失效日期',
    identityOrgName varchar(100) comment '提供身份标识号管理机构名称',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-病例概要-服务对象标识信息表';

### 电子病例-病例概要-人口学信息表
drop table if exists emr_summary_larithmics;
create table emr_summary_larithmics(
    id varchar(100) not null comment '主键',
    emr_summary_id varchar(100) not null comment '病例概要数据信息表主键',
    nationalityCode varchar(100) comment '国籍代码 0-*',
    professionalCode varchar(100) not null comment '职业编码系统名称 0-*',
    ascoCode varchar(100) not null comment '职业代码 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-病例概要-服务对象标识信息表';

### 电子病例-病例概要-地址信息表
drop table if exists emr_summary_address;
create table emr_summary_address(
    id varchar(100) not null comment '主键',
    emr_summary_id varchar(100) not null comment '病例概要数据信息表主键',
    workUnitName varchar(100) comment '工作单位名称 0-*',
    addressType varchar(100) comment '标识地址类别的代码 0-*',
    administrative varchar(100) comment '行政区划代码 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-病例概要-地址信息表';

### 电子病例-病例概要-通信信息表
drop table if exists emr_summary_communication;
create table emr_summary_communication(
    id varchar(100) not null comment '主键',
    emr_summary_id varchar(100) not null comment '病例概要数据信息表主键',
    cellphoneCategory varchar(100) not null comment '联系电话类别 1-*',
    cellphoneCategoryCode varchar(100) comment '联系电话类别代码 0-*',
    cellphone varchar(100) not null comment '联系电话号码 1-*',
    emailAddress varchar(100) comment '电子邮件地址 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-病例概要-通信信息表';

### 电子病例-病例概要-联系人信息表
drop table if exists emr_summary_contact;
create table emr_summary_contact(
    id varchar(100) not null comment '主键',
    emr_summary_id varchar(100) not null comment '病例概要数据信息表主键',
    identNumberTypeCode varchar(100) not null comment '标识号-类别代码',
    identNumber varchar(100) not null comment '标识号-号码*',
    identNumberEffectiveDate datetime not null comment '标识号-生效日期',
    identNumberExpiryDate datetime comment '标识号-失效日期',
    identityOrgName varchar(100) comment '提供身份标识号管理机构名称',
    documentExpiryDate datetime comment '文档标识-失效日期',
    identName varchar(100) not null comment '姓名-标识对象',
    identNameCode varchar(100) comment '姓名-标识对象代码',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-病例概要-联系人信息表';

### 电子病例-病例概要-事件摘要信息表
drop table if exists emr_summary_event;
create table emr_summary_event(
    id varchar(100) not null comment '主键',
    emr_summary_id varchar(100) not null comment '病例概要数据信息表主键',
    eventName varchar(100) not null comment '事件名称 1-*',
    eventBeginTime datetime not null comment '事件开始时间 1-*',
    eventEndTime datetime comment '时间结束时间 0-*',
    eventOrgName varchar(100) comment '事件发生机构 0-*',
    eventDepartment varchar(100) comment '事件发生科室 0-*',
    eventParticipant varchar(100) comment '事件参与方 0-*',
    eventReason varchar(100) comment '事件原因 1-*',
    eventEnd varchar(100) comment '事件结局 1-*',
    eventTypeCode varchar(100) comment '事件类别代码',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-病例概要-事件摘要信息表';


### 电子病例-病例概要-疾病史信息表
drop table if exists emr_summary_physical_examination;
create table emr_summary_physical_examination(
    id varchar(100) not null comment '主键',
    emr_summary_id varchar(100) not null comment '病例概要数据信息表主键',
    pastHistory varchar(100) comment '既往史疾病史 0-*',
    pastSpiritName varchar(100) comment '既往精神类诊断名称 0-*',
    pastIllnessName varchar(100) comment '既往疾病名称 0-*',
    pastIllnessCode varchar(100) comment '既往疾病代码 0-*',
    DiagnoseOrg varchar(100) comment '既往疾病诊断机构 0-*',
    DiagnoseOrgRankCode varchar(100) comment '既往疾病诊断机构级别代码 0-*',
    pastIllnessTime datetime comment '既往疾病诊断时间 0-*',
    pastIllnessState varchar(100) comment '既往疾病当前状态 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-病例概要-疾病史信息表';

### 电子病例-病例概要-医保信息表
drop table if exists emr_summary_medicare;
create table emr_summary_medicare(
    id varchar(100) not null comment '主键',
    emr_summary_id varchar(100) not null comment '病例概要数据信息表主键',
    medicalInureCategory varchar(100) comment '医疗保险类别',
    medicalTreatmentName varchar(100) comment '医疗待遇名称',
    medicalTreatmentType varchar(100) comment '医疗待遇代码',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-病例概要-既往史信息表';

### 电子病例-病例概要-用药信息表
drop table if exists emr_summary_pharmacy;
create table emr_summary_pharmacy(
    id varchar(100) not null comment '主键',
    emr_summary_id varchar(100) not null comment '病例概要数据信息表主键',
    pharmacyMethod varchar(100) comment '用药方法',
    pharmacyFrequency varchar(100) comment '用药频率',
    pharmacyUnits varchar(100) comment '用药计量单位',
    pharmacyOnce varchar(100) comment '用药一次剂量',
    pharmacyTotal varchar(100) comment '用药总剂量',
    pharmacyWay varchar(100) comment '用药途径',
    medicineName varchar(100) comment '药物名称',
    medicineCategory varchar(100) comment '药物类型',
    medicineNameCode varchar(100) comment '药物名称代码',
    medicineFormulation varchar(100) comment '药物剂型代码',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-病例概要-用药信息表';

### 电子病例-病例概要-医疗费用信息表
drop table if exists emr_summary_medicare_cost;
create table emr_summary_medicare_cost(
    id varchar(100) not null comment '主键',
    emr_summary_id varchar(100) not null comment '病例概要数据信息表主键',
    medicalCostCategory varchar(100) comment '门诊费用-分类',
    medicalCostCategoryCode varchar(100) comment '门诊费用-分类代码',
    medicalCost varchar(100) comment '门诊费用-金额',
    paymentCategory varchar(100) comment '支付方式',
    personalExpenses varchar(100) comment '个人承担费用',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-病例概要-医疗费用信息表';

########################################################################################################################

### 门(急)诊数据集信息表
drop table if exists emr_opc_clinc;
create table emr_opc_clinc(
    id varchar(100) not null comment '主键',
    documentId varchar(100) not null default '门(急)诊病历' comment '文档标识-名称',
    documentCode varchar(100) comment '文档标识-类别代码',
    documentOrganizationName varchar(100) not null comment '文档标识-管理机构名称',
    documentOrganizationCode varchar(100) comment '文档标识-管理机构代码',
    documentNumber varchar(100) comment '文档标识-号码',
    documentEffectiveDate datetime not null comment '文档标识-生效日期',
    documentExpiryDate datetime comment '文档标识-失效日期',
    identName varchar(100) not null comment '姓名-标识对象',
    identNameCode varchar(100) comment '姓名-标识对象代码',
    name varchar(100) not null comment '姓名',
    patientTypeCode varchar(100) comment '病人类型代码',
    larithmicsGenderCode varchar(10) not null comment '人口学性别代码',
    larithmicsAge varchar(100) not null comment '年龄(岁)',
    nationCode varchar(100) comment '民族代码',
    marriageCode varchar(100) not null comment '婚姻状况代码',
    birthday date not null comment '出生日期',
    birthplace varchar(100) comment '出生地',
    province varchar(100) not null comment '省',
    city varchar(100) not null comment '市',
    county varchar(100) not null comment '县',
    village varchar(100) not null comment '乡',
    hamlet varchar(100) not null comment '村',
    houseNumber varchar(100) not null comment '门牌号码',
    postalCode varchar(100) not null comment '邮政编码',
    administrative varchar(100) comment '行政区划代码 0-*',
    orgName varchar(100) not null comment '机构名称',
    orgNameCode varchar(100) not null comment '机构名称代码',
    orgCharge varchar(100) comment '机构负责人',
    orgAddress varchar(100) comment '机构地址',
    eventTypeCode varchar(100) comment '事件类别代码',
    eventEnd varchar(100) comment '事件结局 1-*',
    symptomSystemCode varchar(100) not null comment '症状编码体系代码',
    symptomBeginTime datetime not null comment '症状开始日期',
    symptomEndTime datetime not null comment '症状停止日期',
    firstVisit varchar(100) comment '初诊标志 0-*',
    surveyCategoryCode varchar(100) comment '观察类别代码',
    diagnosisCategory varchar(100) comment '诊断类别',
    proposedInspect varchar(100) comment '拟做的检查',
    proposedMedicalTest varchar(100) comment '拟做的医学测试',
    futureTreatmentPlan varchar(100) comment '今后治疗方案',
    followSign varchar(100) comment '随访标志',
    followDay varchar(100) comment '随访间隔天数',
    doctorOrder varchar(100) comment '医嘱',
    specialRemark varchar(100) comment '特别注意事项',
    treatmentProcessName varchar(100) comment '诊疗过程名称',
    treatmentProcessDesc varchar(100) comment '诊疗过程描述',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='门急诊数据信息表';

### 电子病例-门(急)诊病历子集-服务对象标识信息表
drop table if exists emr_opc_patient;
create table emr_opc_patient(
    id varchar(100) not null comment '主键',
    emr_opc_id varchar(100) not null comment '门急诊数据信息表主键',
    identNumberTypeCode varchar(100) not null comment '标识号-类别代码',
    identNumber varchar(100) not null comment '标识号-号码*',
    identNumberEffectiveDate datetime not null comment '标识号-生效日期',
    identNumberExpiryDate datetime comment '标识号-失效日期',
    identityOrgName varchar(100) comment '提供身份标识号管理机构名称',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门急诊-服务对象标识信息表';

### 电子病例-门(急)诊病历子集-人口学信息表
drop table if exists emr_opc_larithmics;
create table emr_opc_larithmics(
    id varchar(100) not null comment '主键',
    emr_opc_id varchar(100) not null comment '门急诊数据信息表主键',
    nationalityCode varchar(100) comment '国籍代码 0-*',
    professionalCode varchar(100) not null comment '职业编码系统名称 0-*',
    ascoCode varchar(100) not null comment '职业代码 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门急诊-服务对象标识信息表';

### 电子病例-门(急)诊病历子集-地址信息表
drop table if exists emr_opc_address;
create table emr_opc_address(
    id varchar(100) not null comment '主键',
    emr_opc_id varchar(100) not null comment '门急诊数据信息表主键',
    workUnitName varchar(100) comment '工作单位名称 0-*',
    addressType varchar(100) comment '标识地址类别的代码 0-*',
    administrative varchar(100) comment '行政区划代码 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门急诊-地址信息表';

### 电子病例-门(急)诊病历子集-通信信息表
drop table if exists emr_opc_communication;
create table emr_opc_communication(
    id varchar(100) not null comment '主键',
    emr_opc_id varchar(100) not null comment '门急诊数据信息表主键',
    cellphoneCategory varchar(100) not null comment '联系电话类别 1-*',
    cellphoneCategoryCode varchar(100) comment '联系电话类别代码 0-*',
    cellphone varchar(100) not null comment '联系电话号码 1-*',
    emailAddress varchar(100) comment '电子邮件地址 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门急诊-通信信息表';

### 电子病例-门(急)诊病历子集-卫生服务机构信息表
drop table if exists emr_opc_health_services;
create table emr_opc_health_services(
    id varchar(100) not null comment '主键',
    emr_opc_id varchar(100) not null comment '门急诊数据信息表主键',
    departmentName varchar(100) not null comment '科室名称 1-*',
    orgRole varchar(100) comment '机构角色 0-*',
    orgRoleCode varchar(100) comment '机构角色代码 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门急诊-卫生服务机构信息表';


### 电子病例-门(急)诊病历子集-卫生服务者信息表
drop table if exists emr_opc_health_provider;
create table emr_opc_health_provider(
    id varchar(100) not null comment '主键',
    emr_opc_id varchar(100) not null comment '门急诊数据信息表主键',
    serverName varchar(100) not null comment '服务者名称',
    serverDuty varchar(100) not null comment '服务者职责 1-*',
    serverDutyCode varchar(100) comment '服务者职责代码 0-*',
    serverMajorTech varchar(100) comment '服务者专业技术 0-*',
    serverEducation varchar(100) comment '服务者学历 0-*',
    serverMajor varchar(100) comment '服务者专业 0-*',
    serverMajorRank varchar(100) comment '服务者专业等级 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门急诊-卫生服务机构信息表';

### 电子病例-门(急)诊病历子集-事件摘要信息表
drop table if exists emr_opc_event;
create table emr_opc_event(
    id varchar(100) not null comment '主键',
    emr_opc_id varchar(100) not null comment '门急诊数据信息表主键',
    eventName varchar(100) not null comment '事件名称 1-*',
    eventBeginTime datetime not null comment '事件开始时间 1-*',
    eventEndTime datetime comment '时间结束时间 0-*',
    eventOrgName varchar(100) comment '事件发生机构 0-*',
    eventDepartment varchar(100) comment '事件发生科室 0-*',
    eventParticipant varchar(100) comment '事件参与方 0-*',
    eventReason varchar(100) comment '事件原因 1-*',
    eventEnd varchar(100) comment '事件结局 1-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门急诊-事件摘要信息表';

### 电子病例-门(急)诊病历子集-主诉信息表
drop table if exists emr_opc_main_suit;
create table emr_opc_main_suit(
    id varchar(100) not null comment '主键',
    emr_opc_id varchar(100) not null comment '门急诊数据信息表主键',
    chaiefComplaint varchar(100) not null comment '主诉 1-*',
    symptomCode varchar(100) comment '症状代码 0-*',
    symptomDesc varchar(100) not null comment '症状描述 1-*',
    symptomAcuityCode varchar(100) comment '症状急性程度代码 0-*',
    symptomSeverityCode varchar(100) comment '症状严重程度代码 0-*',
    firstVisit varchar(100) comment '初诊标志 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门急诊-主诉信息表';

### 电子病例-门(急)诊病历子集-体格检查信息表
drop table if exists emr_opc_physical_examination;
create table emr_opc_physical_examination(
    id varchar(100) not null comment '主键',
    emr_opc_id varchar(100) not null comment '门急诊数据信息表主键',
    onsetTime datetime not null comment '起病时间 1-*',
    onsetSolarCode varchar(100) comment '起病节气代码 0-*',
    onsetDesc varchar(100) not null comment '起病情况描述 1-*',
    onsetBeginReason varchar(100) not null comment '起病开始原因 1-*',
    symptomTrait varchar(100) not null comment '症状特点 1-*',
    followSymptom varchar(100) not null comment '伴随症状 1-*',
    treatmentProcess varchar(100) comment '诊疗过程 0-*',
    onsetEndCondition varchar(100) comment '起病后情况 0-*',
    baseDeDiseaseTreatmentCondition varchar(100) comment '基础疾病诊疗情况 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门急诊-体格检查信息表';


### 电子病例-门(急)诊病历子集-既往史信息表
drop table if exists emr_opc_physical_examination;
create table emr_opc_physical_examination(
    id varchar(100) not null comment '主键',
    emr_opc_id varchar(100) not null comment '门急诊数据信息表主键',
    pastHistoryProjectName varchar(100) comment '既往史项目名称 0-*',
    pastHistoryProjectTypeCode varchar(100) comment '既往史项目类别代码 0-*',
    pastHistoryProjectCodeName varchar(100) comment '既往史项目代码名称 0-*',
    pastHistoryProjectCode varchar(100) comment '既往史项目代码 0-*',
    pastHistoryMethodCode varchar(100) comment '既往史方法代码 0-*',
    pastHistoryResult varchar(100) comment '既往观察结果 0-*',
    pastHistoryCategoryName varchar(100) comment '既往史类目名称 0-*',
    pastHistoryResults varchar(100) comment '既往观察结果(多个) 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门急诊-既往史信息表';

### 电子病例-门(急)诊病历子集-过敏史信息表
drop table if exists emr_opc_allergic_history;
create table emr_opc_allergic_history(
     id varchar(100) not null comment '主键',
     emr_opc_id varchar(100) not null comment '门急诊数据信息表主键',
     allergicHistory varchar(100) comment '过敏史 0-*',
     allergen varchar(100) comment '过敏原 0-*',
     allergicSymptom varchar(100) comment '过敏症状 0-*',
     allergicSymptomCode varchar(100) comment '过敏症状代码 0-*',
     allergenCode varchar(100) comment '过敏原代码 0-*',
     allergicMedicineName varchar(100) comment '过敏药物名称 0-*',
     allergicIllnessStateCode varchar(100) comment '过敏病情状态代码 0-*',
     allergicSeriousCode varchar(100) comment '过敏严重性代码 0-*',
     allergicIdentityCode varchar(100) comment '过敏标识代码 0-*',
     status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
     createUser varchar(100) comment '记录创建人',
     createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
     updateUser varchar(100) comment '记录修改人',
     updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
     primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门急诊-过敏史信息表';


### 电子病例-门(急)诊病历子集-诊断信息表
drop table if exists emr_opc_diagnosis;
create table emr_opc_diagnosis(
    id varchar(100) not null comment '主键',
    emr_opc_id varchar(100) not null comment '门急诊数据信息表主键',
    diagnosisOrgName varchar(100) comment '诊断机构代码 0-*',
    diagnosisCategoryCode varchar(100) comment '诊断类别代码 0-*',
    diagnosisSequenceCode varchar(100) comment '诊断顺位代码 0-*',
    diseaseName varchar(100) comment '疾病名称 0-*',
    diseaseCode varchar(100) comment '疾病代码 0-*',
    diagnosisProof varchar(100) comment '诊断依据 0-*',
    diagnosisProofCode varchar(100) comment '诊断依据代码 0-*',
    diagnosisTime datetime comment '诊断日期 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门急诊-诊断信息表';

### 电子病例-门(急)诊病历子集-医嘱信息表
drop table if exists emr_opc_doctorOrder;
create table emr_opc_doctorOrder(
    id varchar(100) not null comment '主键',
    emr_opc_id varchar(100) not null comment '门急诊数据信息表主键',
    doctorOrderChargeTime datetime comment '医嘱开嘱时间',
    doctorOrderEndTime datetime comment '长期医嘱停止时间',
    doctorOrderExecuteTime datetime comment '医嘱执行时间',
    doctorOrderExecuteTimeTypeCode varchar(100) comment '医嘱执行时间类别代码',
    doctorOrderCancelTime datetime comment '医嘱取消日期',
    doctorOrderType varchar(100) comment '医嘱类别',
    doctorOrderContent varchar(100) comment '医嘱内容',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门急诊-医嘱信息表';

#######################################################################################################################

### 门(急)诊处方数据集信息表
drop table if exists emr_prescription_clinc;
create table emr_prescription_clinc(
    id varchar(100) not null comment '主键',
    documentId varchar(100) not null default '门(急)诊处方病历' comment '文档标识-名称',
    documentCode varchar(100) comment '文档标识-类别代码',
    documentOrganizationName varchar(100) not null comment '文档标识-管理机构名称',
    documentOrganizationCode varchar(100) comment '文档标识-管理机构代码',
    documentNumber varchar(100) comment '文档标识-号码',
    documentEffectiveDate datetime not null comment '文档标识-生效日期',
    documentExpiryDate datetime comment '文档标识-失效日期',
    identName varchar(100) not null comment '姓名-标识对象',
    identNameCode varchar(100) comment '姓名-标识对象代码',
    name varchar(100) not null comment '姓名',
    patientTypeCode varchar(100) comment '病人类型代码',
    larithmicsGenderCode varchar(10) not null comment '人口学性别代码',
    larithmicsAge varchar(100) not null comment '年龄(岁)',
    nationCode varchar(100) comment '民族代码',
    marriageCode varchar(100) not null comment '婚姻状况代码',
    birthday date not null comment '出生日期',
    birthplace varchar(100) comment '出生地',
    province varchar(100) not null comment '省',
    city varchar(100) not null comment '市',
    county varchar(100) not null comment '县',
    village varchar(100) not null comment '乡',
    hamlet varchar(100) not null comment '村',
    houseNumber varchar(100) not null comment '门牌号码',
    postalCode varchar(100) not null comment '邮政编码',
    administrative varchar(100) comment '行政区划代码 0-*',
    orgName varchar(100) not null comment '机构名称',
    orgNameCode varchar(100) not null comment '机构名称代码',
    orgCharge varchar(100) comment '机构负责人',
    orgAddress varchar(100) comment '机构地址',
    eventTypeCode varchar(100) comment '事件类别代码',
    eventEnd varchar(100) comment '事件结局 1-*',
    diagnosisCategory varchar(100) comment '诊断类别',
    treatmentProcessName varchar(100) comment '诊疗过程名称',
    treatmentProcessDesc varchar(100) comment '诊疗过程描述',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='门(急)诊处方病历数据信息表';

### 电子病例-门(急)诊处方病历-服务对象标识信息表
drop table if exists emr_prescription_patient;
create table emr_prescription_patient(
    id varchar(100) not null comment '主键',
    emr_prescription_id varchar(100) not null comment '门(急)诊处方病历数据信息表主键',
    identNumberTypeCode varchar(100) not null comment '标识号-类别代码',
    identNumber varchar(100) not null comment '标识号-号码*',
    identNumberEffectiveDate datetime not null comment '标识号-生效日期',
    identNumberExpiryDate datetime comment '标识号-失效日期',
    identityOrgName varchar(100) comment '提供身份标识号管理机构名称',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门(急)诊处方病历-服务对象标识信息表';

### 电子病例-门(急)诊处方病历-人口学信息表
drop table if exists emr_prescription_larithmics;
create table emr_prescription_larithmics(
    id varchar(100) not null comment '主键',
    emr_prescription_id varchar(100) not null comment '门(急)诊处方病历数据信息表主键',
    nationalityCode varchar(100) comment '国籍代码 0-*',
    professionalCode varchar(100) not null comment '职业编码系统名称 0-*',
    ascoCode varchar(100) not null comment '职业代码 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门(急)诊处方病历-服务对象标识信息表';

### 电子病例-门(急)诊处方病历-地址信息表
drop table if exists emr_prescription_address;
create table emr_prescription_address(
    id varchar(100) not null comment '主键',
    emr_prescription_id varchar(100) not null comment '门(急)诊处方病历数据信息表主键',
    workUnitName varchar(100) comment '工作单位名称 0-*',
    addressType varchar(100) comment '标识地址类别的代码 0-*',
    administrative varchar(100) comment '行政区划代码 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门(急)诊处方病历-地址信息表';

### 电子病例-门(急)诊处方病历-通信信息表
drop table if exists emr_prescription_communication;
create table emr_prescription_communication(
    id varchar(100) not null comment '主键',
    emr_prescription_id varchar(100) not null comment '门(急)诊处方病历数据信息表主键',
    cellphoneCategory varchar(100) not null comment '联系电话类别 1-*',
    cellphoneCategoryCode varchar(100) comment '联系电话类别代码 0-*',
    cellphone varchar(100) not null comment '联系电话号码 1-*',
    emailAddress varchar(100) comment '电子邮件地址 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门(急)诊处方病历-通信信息表';

### 电子病例-门(急)诊处方病历-卫生服务机构信息表
drop table if exists emr_prescription_health_services;
create table emr_prescription_health_services(
    id varchar(100) not null comment '主键',
    emr_prescription_id varchar(100) not null comment '门(急)诊处方病历数据信息表主键',
    departmentName varchar(100) not null comment '科室名称 1-*',
    orgRole varchar(100) comment '机构角色 0-*',
    orgRoleCode varchar(100) comment '机构角色代码 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门(急)诊处方病历-卫生服务机构信息表';


### 电子病例-门(急)诊处方病历-卫生服务者信息表
drop table if exists emr_prescription_health_provider;
create table emr_prescription_health_provider(
    id varchar(100) not null comment '主键',
    emr_prescription_id varchar(100) not null comment '门(急)诊处方病历数据信息表主键',
    serverName varchar(100) not null comment '服务者名称',
    serverDuty varchar(100) not null comment '服务者职责 1-*',
    serverDutyCode varchar(100) comment '服务者职责代码 0-*',
    serverMajorTech varchar(100) comment '服务者专业技术 0-*',
    serverEducation varchar(100) comment '服务者学历 0-*',
    serverMajor varchar(100) comment '服务者专业 0-*',
    serverMajorRank varchar(100) comment '服务者专业等级 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门(急)诊处方病历-卫生服务机构信息表';

### 电子病例-门(急)诊处方病历-事件摘要信息表
drop table if exists emr_prescription_event;
create table emr_prescription_event(
    id varchar(100) not null comment '主键',
    emr_prescription_id varchar(100) not null comment '门(急)诊处方病历数据信息表主键',
    eventName varchar(100) not null comment '事件名称 1-*',
    eventBeginTime datetime not null comment '事件开始时间 1-*',
    eventEndTime datetime comment '时间结束时间 0-*',
    eventOrgName varchar(100) comment '事件发生机构 0-*',
    eventDepartment varchar(100) comment '事件发生科室 0-*',
    eventParticipant varchar(100) comment '事件参与方 0-*',
    eventReason varchar(100) comment '事件原因 1-*',
    eventEnd varchar(100) comment '事件结局 1-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门(急)诊处方病历-事件摘要信息表';


### 电子病例-门(急)诊处方病历-诊断信息表
drop table if exists emr_prescription_diagnosis;
create table emr_prescription_diagnosis(
    id varchar(100) not null comment '主键',
    emr_prescription_id varchar(100) not null comment '门(急)诊处方病历数据信息表主键',
    diagnosisOrgName varchar(100) comment '诊断机构代码 0-*',
    diagnosisCategoryCode varchar(100) comment '诊断类别代码 0-*',
    diagnosisSequenceCode varchar(100) comment '诊断顺位代码 0-*',
    diseaseName varchar(100) comment '疾病名称 0-*',
    diseaseCode varchar(100) comment '疾病代码 0-*',
    diagnosisProof varchar(100) comment '诊断依据 0-*',
    diagnosisProofCode varchar(100) comment '诊断依据代码 0-*',
    diagnosisTime datetime comment '诊断日期 0-*',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门(急)诊处方病历-诊断信息表';


### 电子病例-门(急)诊处方病历-用药信息表
drop table if exists emr_prescription_pharmacy;
create table emr_prescription_pharmacy(
    id varchar(100) not null comment '主键',
    emr_prescription_id varchar(100) not null comment '门(急)诊处方病历数据信息表主键',
    pharmacyMethod varchar(100) comment '用药方法',
    pharmacyFrequency varchar(100) comment '用药频率',
    pharmacyUnits varchar(100) comment '用药计量单位',
    pharmacyOnce varchar(100) comment '用药一次剂量',
    pharmacyTotal varchar(100) comment '用药总剂量',
    pharmacyWay varchar(100) comment '用药途径',
    medicineName varchar(100) comment '药物名称',
    medicineCategory varchar(100) comment '药物类型',
    medicineNameCode varchar(100) comment '药物名称代码',
    medicineFormulation varchar(100) comment '药物剂型代码',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门(急)诊处方病历-用药信息表';


### 电子病例-门(急)诊处方病历-联系人信息表
drop table if exists emr_prescription_contact;
create table emr_prescription_contact(
    id varchar(100) not null comment '主键',
    emr_prescription_id varchar(100) not null comment '门(急)诊处方病历数据信息表主键',
    identNumberTypeCode varchar(100) not null comment '标识号-类别代码',
    identNumber varchar(100) not null comment '标识号-号码*',
    identNumberEffectiveDate datetime not null comment '标识号-生效日期',
    identNumberExpiryDate datetime comment '标识号-失效日期',
    identityOrgName varchar(100) comment '提供身份标识号管理机构名称',
    documentExpiryDate datetime comment '文档标识-失效日期',
    identName varchar(100) not null comment '姓名-标识对象',
    identNameCode varchar(100) comment '姓名-标识对象代码',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门(急)诊处方病历-联系人信息表';

### 电子病例-门(急)诊处方病历-医保信息表
drop table if exists emr_prescription_medicare;
create table emr_prescription_medicare(
    id varchar(100) not null comment '主键',
    emr_prescription_id varchar(100) not null comment '门(急)诊处方病历数据信息表主键',
    medicalInureCategory varchar(100) comment '医疗保险类别',
    medicalTreatmentName varchar(100) comment '医疗待遇名称',
    medicalTreatmentType varchar(100) comment '医疗待遇代码',
    status varchar(10) not null default '1' comment '系统状态 0-禁用， 1-启用',
    createUser varchar(100) comment '记录创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '记录修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '记录修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='电子病例-门(急)诊处方病历-既往史信息表';