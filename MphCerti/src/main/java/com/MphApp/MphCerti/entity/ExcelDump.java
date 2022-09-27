package com.MphApp.MphCerti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExcelDump {
	private String Date;
	@Id
	private Integer Employee_Number;
	private String Employee_Name;
	private String Date_Of_Joining;
	private String Location;
	private String Pos_Loc_Name;
	private String Location_Type;
	private String Pos_Loc_Type;
	private String Employee_Type;
	private String Role_Desc;
	private Integer Work_Allocation;
	private Integer Bill_Allocation;
	private String Billing_Type_Role;
	private String Grade_Desc;
	private String Project_Role;
	private Integer End_Client_Id;
	private String End_Client_Name;
	private Integer End_Client_Group;
	private String End_Client_Group_Name;
	private String Marketing_Unit;
	private String Sub_Marketing_Unit;
	private String Channel;
	private String Bussiness_Organization;
	private String Service_type;
	private String Delivery_Unit;
	private Integer Project_Number;
	private String Project_Name;
	private String Assignment_Start_Date;
	private String Assignment_End_Date;
	private String Resource_Allocation_Status;
	private String Project_Type;
	private String Project_Bill_Flag;
	private String Project_Billing_Category;
	private Integer DM_Employee_Number;
	private String Dm_Employee_Name;
	private Integer Vl_Employee_Number;
	private String VL_Employee_Name;
	private Integer Dh_Employee_Number;
	private String Dh_Employee_Name;
	private String Parctice;
	private String Sub_Partice;
	private String DOH_Level;
	private String Assignment;
	private String Employee_Category;
	private String Op_Comm_Model;
	private String Op_serv_Type;
	private String FTE;
	private String Tower;
	private String Freshers;
	private Integer Times;
	private Integer HeadCount;
	private Integer Freashers_HC;
	private Integer Sum_Of_Bill_Allocation;
	private String Project_Bill_Flag1;
	private String Category;
	private String Channel1;
	private String SMU;
	private String DU_Leader;
	private String DU_Leader2;
	private String Category_Bill_Buffer;
	private String Section;
	private String Section2;
	private String SMU2;
	private String Operational_Client_Group;
	private String Expense_Type;
	private String Res_Practice;
	private String Creation_Date;
	private String Supervisor_Name;
	private String Resource_Country;
	private String Employee_Email;
	private String Bussiness_Unit;
	private String MU_Name;
	private String MarketUnit_Leader;
	private Integer Aging;
	private Integer Month;
	private String Aging_Bucket;
	private String PM;
	private String Critical_Employee_Flag;
	private String Billing_Start_Flag;
	private String ReleaseDate_In_prism;
	private String Billing_Month;
	private String Release_Month;
	private String Billing_Plan_Status_in_prism;
	private String Seperation_Date;
	private String Release_Reason;
	private String Competence;
	private String Primary_Compentence_Area;
	private String Primary_Subskill1;
	private String Secondary_Competency_Area;
	private String Secondary_Subskill1;
	
	public ExcelDump(String date, Integer employee_Number, String employee_Name, String date_Of_Joining,
			String location, String pos_Loc_Name, String location_Type, String pos_Loc_Type, String employee_Type,
			String role_Desc, Integer work_Allocation, Integer bill_Allocation, String billing_Type_Role,
			String grade_Desc, String project_Role, Integer end_Client_Id, String end_Client_Name,
			Integer end_Client_Group, String end_Client_Group_Name, String marketing_Unit, String sub_Marketing_Unit,
			String channel, String bussiness_Organization, String service_type, String delivery_Unit,
			Integer project_Number, String project_Name, String assignment_Start_Date, String assignment_End_Date,
			String resource_Allocation_Status, String project_Type, String project_Bill_Flag,
			String project_Billing_Category, Integer dM_Employee_Number, String dm_Employee_Name,
			Integer vl_Employee_Number, String vL_Employee_Name, Integer dh_Employee_Number, String dh_Employee_Name,
			String parctice, String sub_Partice, String dOH_Level, String assignment, String employee_Category,
			String op_Comm_Model, String op_serv_Type, String fTE, String tower, String freshers, Integer times,
			Integer headCount, Integer freashers_HC, Integer sum_Of_Bill_Allocation, String project_Bill_Flag1,
			String category, String channel1, String sMU, String dU_Leader, String dU_Leader2,
			String category_Bill_Buffer, String section, String section2, String sMU2, String operational_Client_Group,
			String expense_Type, String res_Practice, String creation_Date, String supervisor_Name,
			String resource_Country, String employee_Email, String bussiness_Unit, String mU_Name,
			String marketUnit_Leader, Integer aging, Integer month, String aging_Bucket, String pM,
			String critical_Employee_Flag, String billing_Start_Flag, String releaseDate_In_prism, String billing_Month,
			String release_Month, String billing_Plan_Status_in_prism, String seperation_Date, String release_Reason,
			String competence, String primary_Compentence_Area, String primary_Subskill1,
			String secondary_Competency_Area, String secondary_Subskill1) {
		super();
		Date = date;
		Employee_Number = employee_Number;
		Employee_Name = employee_Name;
		Date_Of_Joining = date_Of_Joining;
		Location = location;
		Pos_Loc_Name = pos_Loc_Name;
		Location_Type = location_Type;
		Pos_Loc_Type = pos_Loc_Type;
		Employee_Type = employee_Type;
		Role_Desc = role_Desc;
		Work_Allocation = work_Allocation;
		Bill_Allocation = bill_Allocation;
		Billing_Type_Role = billing_Type_Role;
		Grade_Desc = grade_Desc;
		Project_Role = project_Role;
		End_Client_Id = end_Client_Id;
		End_Client_Name = end_Client_Name;
		End_Client_Group = end_Client_Group;
		End_Client_Group_Name = end_Client_Group_Name;
		Marketing_Unit = marketing_Unit;
		Sub_Marketing_Unit = sub_Marketing_Unit;
		Channel = channel;
		Bussiness_Organization = bussiness_Organization;
		Service_type = service_type;
		Delivery_Unit = delivery_Unit;
		Project_Number = project_Number;
		Project_Name = project_Name;
		Assignment_Start_Date = assignment_Start_Date;
		Assignment_End_Date = assignment_End_Date;
		Resource_Allocation_Status = resource_Allocation_Status;
		Project_Type = project_Type;
		Project_Bill_Flag = project_Bill_Flag;
		Project_Billing_Category = project_Billing_Category;
		DM_Employee_Number = dM_Employee_Number;
		Dm_Employee_Name = dm_Employee_Name;
		Vl_Employee_Number = vl_Employee_Number;
		VL_Employee_Name = vL_Employee_Name;
		Dh_Employee_Number = dh_Employee_Number;
		Dh_Employee_Name = dh_Employee_Name;
		Parctice = parctice;
		Sub_Partice = sub_Partice;
		DOH_Level = dOH_Level;
		Assignment = assignment;
		Employee_Category = employee_Category;
		Op_Comm_Model = op_Comm_Model;
		Op_serv_Type = op_serv_Type;
		FTE = fTE;
		Tower = tower;
		Freshers = freshers;
		Times = times;
		HeadCount = headCount;
		Freashers_HC = freashers_HC;
		Sum_Of_Bill_Allocation = sum_Of_Bill_Allocation;
		Project_Bill_Flag1 = project_Bill_Flag1;
		Category = category;
		Channel1 = channel1;
		SMU = sMU;
		DU_Leader = dU_Leader;
		DU_Leader2 = dU_Leader2;
		Category_Bill_Buffer = category_Bill_Buffer;
		Section = section;
		Section2 = section2;
		SMU2 = sMU2;
		Operational_Client_Group = operational_Client_Group;
		Expense_Type = expense_Type;
		Res_Practice = res_Practice;
		Creation_Date = creation_Date;
		Supervisor_Name = supervisor_Name;
		Resource_Country = resource_Country;
		Employee_Email = employee_Email;
		Bussiness_Unit = bussiness_Unit;
		MU_Name = mU_Name;
		MarketUnit_Leader = marketUnit_Leader;
		Aging = aging;
		Month = month;
		Aging_Bucket = aging_Bucket;
		PM = pM;
		Critical_Employee_Flag = critical_Employee_Flag;
		Billing_Start_Flag = billing_Start_Flag;
		ReleaseDate_In_prism = releaseDate_In_prism;
		Billing_Month = billing_Month;
		Release_Month = release_Month;
		Billing_Plan_Status_in_prism = billing_Plan_Status_in_prism;
		Seperation_Date = seperation_Date;
		Release_Reason = release_Reason;
		Competence = competence;
		Primary_Compentence_Area = primary_Compentence_Area;
		Primary_Subskill1 = primary_Subskill1;
		Secondary_Competency_Area = secondary_Competency_Area;
		Secondary_Subskill1 = secondary_Subskill1;
	}
	public ExcelDump() {
		super();
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public Integer getEmployee_Number() {
		return Employee_Number;
	}
	public void setEmployee_Number(Integer employee_Number) {
		Employee_Number = employee_Number;
	}
	public String getEmployee_Name() {
		return Employee_Name;
	}
	public void setEmployee_Name(String string) {
		Employee_Name = string;
	}
	public String getDate_Of_Joining() {
		return Date_Of_Joining;
	}
	public void setDate_Of_Joining(String date_Of_Joining) {
		Date_Of_Joining = date_Of_Joining;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getPos_Loc_Name() {
		return Pos_Loc_Name;
	}
	public void setPos_Loc_Name(String pos_Loc_Name) {
		Pos_Loc_Name = pos_Loc_Name;
	}
	public String getLocation_Type() {
		return Location_Type;
	}
	public void setLocation_Type(String location_Type) {
		Location_Type = location_Type;
	}
	public String getPos_Loc_Type() {
		return Pos_Loc_Type;
	}
	public void setPos_Loc_Type(String pos_Loc_Type) {
		Pos_Loc_Type = pos_Loc_Type;
	}
	public String getEmployee_Type() {
		return Employee_Type;
	}
	public void setEmployee_Type(String employee_Type) {
		Employee_Type = employee_Type;
	}
	public String getRole_Desc() {
		return Role_Desc;
	}
	public void setRole_Desc(String role_Desc) {
		Role_Desc = role_Desc;
	}
	public Integer getWork_Allocation() {
		return Work_Allocation;
	}
	public void setWork_Allocation(Integer work_Allocation) {
		Work_Allocation = work_Allocation;
	}
	public Integer getBill_Allocation() {
		return Bill_Allocation;
	}
	public void setBill_Allocation(Integer bill_Allocation) {
		Bill_Allocation = bill_Allocation;
	}
	public String getBilling_Type_Role() {
		return Billing_Type_Role;
	}
	public void setBilling_Type_Role(String billing_Type_Role) {
		Billing_Type_Role = billing_Type_Role;
	}
	public String getGrade_Desc() {
		return Grade_Desc;
	}
	public void setGrade_Desc(String grade_Desc) {
		Grade_Desc = grade_Desc;
	}
	public String getProject_Role() {
		return Project_Role;
	}
	public void setProject_Role(String project_Role) {
		Project_Role = project_Role;
	}
	public Integer getEnd_Client_Id() {
		return End_Client_Id;
	}
	public void setEnd_Client_Id(Integer end_Client_Id) {
		End_Client_Id = end_Client_Id;
	}
	public String getEnd_Client_Name() {
		return End_Client_Name;
	}
	public void setEnd_Client_Name(String end_Client_Name) {
		End_Client_Name = end_Client_Name;
	}
	public Integer getEnd_Client_Group() {
		return End_Client_Group;
	}
	public void setEnd_Client_Group(Integer end_Client_Group) {
		End_Client_Group = end_Client_Group;
	}
	public String getEnd_Client_Group_Name() {
		return End_Client_Group_Name;
	}
	public void setEnd_Client_Group_Name(String end_Client_Group_Name) {
		End_Client_Group_Name = end_Client_Group_Name;
	}
	public String getMarketing_Unit() {
		return Marketing_Unit;
	}
	public void setMarketing_Unit(String marketing_Unit) {
		Marketing_Unit = marketing_Unit;
	}
	public String getSub_Marketing_Unit() {
		return Sub_Marketing_Unit;
	}
	public void setSub_Marketing_Unit(String sub_Marketing_Unit) {
		Sub_Marketing_Unit = sub_Marketing_Unit;
	}
	public String getChannel() {
		return Channel;
	}
	public void setChannel(String channel) {
		Channel = channel;
	}
	public String getBussiness_Organization() {
		return Bussiness_Organization;
	}
	public void setBussiness_Organization(String bussiness_Organization) {
		Bussiness_Organization = bussiness_Organization;
	}
	public String getService_type() {
		return Service_type;
	}
	public void setService_type(String service_type) {
		Service_type = service_type;
	}
	public String getDelivery_Unit() {
		return Delivery_Unit;
	}
	public void setDelivery_Unit(String delivery_Unit) {
		Delivery_Unit = delivery_Unit;
	}
	public Integer getProject_Number() {
		return Project_Number;
	}
	public void setProject_Number(Integer project_Number) {
		Project_Number = project_Number;
	}
	public String getProject_Name() {
		return Project_Name;
	}
	public void setProject_Name(String project_Name) {
		Project_Name = project_Name;
	}
	public String getAssignment_Start_Date() {
		return Assignment_Start_Date;
	}
	public void setAssignment_Start_Date(String assignment_Start_Date) {
		Assignment_Start_Date = assignment_Start_Date;
	}
	public String getAssignment_End_Date() {
		return Assignment_End_Date;
	}
	public void setAssignment_End_Date(String assignment_End_Date) {
		Assignment_End_Date = assignment_End_Date;
	}
	public String getResource_Allocation_Status() {
		return Resource_Allocation_Status;
	}
	public void setResource_Allocation_Status(String resource_Allocation_Status) {
		Resource_Allocation_Status = resource_Allocation_Status;
	}
	public String getProject_Type() {
		return Project_Type;
	}
	public void setProject_Type(String project_Type) {
		Project_Type = project_Type;
	}
	public String getProject_Bill_Flag() {
		return Project_Bill_Flag;
	}
	public void setProject_Bill_Flag(String project_Bill_Flag) {
		Project_Bill_Flag = project_Bill_Flag;
	}
	public String getProject_Billing_Category() {
		return Project_Billing_Category;
	}
	public void setProject_Billing_Category(String project_Billing_Category) {
		Project_Billing_Category = project_Billing_Category;
	}
	public Integer getDM_Employee_Number() {
		return DM_Employee_Number;
	}
	public void setDM_Employee_Number(Integer dM_Employee_Number) {
		DM_Employee_Number = dM_Employee_Number;
	}
	public String getDm_Employee_Name() {
		return Dm_Employee_Name;
	}
	public void setDm_Employee_Name(String dm_Employee_Name) {
		Dm_Employee_Name = dm_Employee_Name;
	}
	public Integer getVl_Employee_Number() {
		return Vl_Employee_Number;
	}
	public void setVl_Employee_Number(Integer vl_Employee_Number) {
		Vl_Employee_Number = vl_Employee_Number;
	}
	public String getVL_Employee_Name() {
		return VL_Employee_Name;
	}
	public void setVL_Employee_Name(String vL_Employee_Name) {
		VL_Employee_Name = vL_Employee_Name;
	}
	public Integer getDh_Employee_Number() {
		return Dh_Employee_Number;
	}
	public void setDh_Employee_Number(Integer dh_Employee_Number) {
		Dh_Employee_Number = dh_Employee_Number;
	}
	public String getDh_Employee_Name() {
		return Dh_Employee_Name;
	}
	public void setDh_Employee_Name(String dh_Employee_Name) {
		Dh_Employee_Name = dh_Employee_Name;
	}
	public String getParctice() {
		return Parctice;
	}
	public void setParctice(String parctice) {
		Parctice = parctice;
	}
	public String getSub_Partice() {
		return Sub_Partice;
	}
	public void setSub_Partice(String sub_Partice) {
		Sub_Partice = sub_Partice;
	}
	public String getDOH_Level() {
		return DOH_Level;
	}
	public void setDOH_Level(String dOH_Level) {
		DOH_Level = dOH_Level;
	}
	public String getAssignment() {
		return Assignment;
	}
	public void setAssignment(String assignment) {
		Assignment = assignment;
	}
	public String getEmployee_Category() {
		return Employee_Category;
	}
	public void setEmployee_Category(String employee_Category) {
		Employee_Category = employee_Category;
	}
	public String getOp_Comm_Model() {
		return Op_Comm_Model;
	}
	public void setOp_Comm_Model(String op_Comm_Model) {
		Op_Comm_Model = op_Comm_Model;
	}
	public String getOp_serv_Type() {
		return Op_serv_Type;
	}
	public void setOp_serv_Type(String op_serv_Type) {
		Op_serv_Type = op_serv_Type;
	}
	public String getFTE() {
		return FTE;
	}
	public void setFTE(String fTE) {
		FTE = fTE;
	}
	public String getTower() {
		return Tower;
	}
	public void setTower(String tower) {
		Tower = tower;
	}
	public String getFreshers() {
		return Freshers;
	}
	public void setFreshers(String freshers) {
		Freshers = freshers;
	}
	public Integer getTimes() {
		return Times;
	}
	public void setTimes(Integer times) {
		Times = times;
	}
	public Integer getHeadCount() {
		return HeadCount;
	}
	public void setHeadCount(Integer headCount) {
		HeadCount = headCount;
	}
	public Integer getFreashers_HC() {
		return Freashers_HC;
	}
	public void setFreashers_HC(Integer freashers_HC) {
		Freashers_HC = freashers_HC;
	}
	public Integer getSum_Of_Bill_Allocation() {
		return Sum_Of_Bill_Allocation;
	}
	public void setSum_Of_Bill_Allocation(Integer sum_Of_Bill_Allocation) {
		Sum_Of_Bill_Allocation = sum_Of_Bill_Allocation;
	}
	public String getProject_Bill_Flag1() {
		return Project_Bill_Flag1;
	}
	public void setProject_Bill_Flag1(String project_Bill_Flag1) {
		Project_Bill_Flag1 = project_Bill_Flag1;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getChannel1() {
		return Channel1;
	}
	public void setChannel1(String channel1) {
		Channel1 = channel1;
	}
	public String getSMU() {
		return SMU;
	}
	public void setSMU(String sMU) {
		SMU = sMU;
	}
	public String getDU_Leader() {
		return DU_Leader;
	}
	public void setDU_Leader(String dU_Leader) {
		DU_Leader = dU_Leader;
	}
	public String getDU_Leader2() {
		return DU_Leader2;
	}
	public void setDU_Leader2(String dU_Leader2) {
		DU_Leader2 = dU_Leader2;
	}
	public String getCategory_Bill_Buffer() {
		return Category_Bill_Buffer;
	}
	public void setCategory_Bill_Buffer(String category_Bill_Buffer) {
		Category_Bill_Buffer = category_Bill_Buffer;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	public String getSection2() {
		return Section2;
	}
	public void setSection2(String section2) {
		Section2 = section2;
	}
	public String getSMU2() {
		return SMU2;
	}
	public void setSMU2(String sMU2) {
		SMU2 = sMU2;
	}
	public String getOperational_Client_Group() {
		return Operational_Client_Group;
	}
	public void setOperational_Client_Group(String operational_Client_Group) {
		Operational_Client_Group = operational_Client_Group;
	}
	public String getExpense_Type() {
		return Expense_Type;
	}
	public void setExpense_Type(String expense_Type) {
		Expense_Type = expense_Type;
	}
	public String getRes_Practice() {
		return Res_Practice;
	}
	public void setRes_Practice(String res_Practice) {
		Res_Practice = res_Practice;
	}
	public String getCreation_Date() {
		return Creation_Date;
	}
	public void setCreation_Date(String creation_Date) {
		Creation_Date = creation_Date;
	}
	public String getSupervisor_Name() {
		return Supervisor_Name;
	}
	public void setSupervisor_Name(String supervisor_Name) {
		Supervisor_Name = supervisor_Name;
	}
	public String getResource_Country() {
		return Resource_Country;
	}
	public void setResource_Country(String resource_Country) {
		Resource_Country = resource_Country;
	}
	public String getEmployee_Email() {
		return Employee_Email;
	}
	public void setEmployee_Email(String employee_Email) {
		Employee_Email = employee_Email;
	}
	public String getBussiness_Unit() {
		return Bussiness_Unit;
	}
	public void setBussiness_Unit(String bussiness_Unit) {
		Bussiness_Unit = bussiness_Unit;
	}
	public String getMU_Name() {
		return MU_Name;
	}
	public void setMU_Name(String mU_Name) {
		MU_Name = mU_Name;
	}
	public String getMarketUnit_Leader() {
		return MarketUnit_Leader;
	}
	public void setMarketUnit_Leader(String marketUnit_Leader) {
		MarketUnit_Leader = marketUnit_Leader;
	}
	public Integer getAging() {
		return Aging;
	}
	public void setAging(Integer aging) {
		Aging = aging;
	}
	public Integer getMonth() {
		return Month;
	}
	public void setMonth(Integer month) {
		Month = month;
	}
	public String getAging_Bucket() {
		return Aging_Bucket;
	}
	public void setAging_Bucket(String aging_Bucket) {
		Aging_Bucket = aging_Bucket;
	}
	public String getPM() {
		return PM;
	}
	public void setPM(String pM) {
		PM = pM;
	}
	public String getCritical_Employee_Flag() {
		return Critical_Employee_Flag;
	}
	public void setCritical_Employee_Flag(String critical_Employee_Flag) {
		Critical_Employee_Flag = critical_Employee_Flag;
	}
	public String getBilling_Start_Flag() {
		return Billing_Start_Flag;
	}
	public void setBilling_Start_Flag(String billing_Start_Flag) {
		Billing_Start_Flag = billing_Start_Flag;
	}
	public String getReleaseDate_In_prism() {
		return ReleaseDate_In_prism;
	}
	public void setReleaseDate_In_prism(String releaseDate_In_prism) {
		ReleaseDate_In_prism = releaseDate_In_prism;
	}
	public String getBilling_Month() {
		return Billing_Month;
	}
	public void setBilling_Month(String billing_Month) {
		Billing_Month = billing_Month;
	}
	public String getRelease_Month() {
		return Release_Month;
	}
	public void setRelease_Month(String release_Month) {
		Release_Month = release_Month;
	}
	public String getBilling_Plan_Status_in_prism() {
		return Billing_Plan_Status_in_prism;
	}
	public void setBilling_Plan_Status_in_prism(String billing_Plan_Status_in_prism) {
		Billing_Plan_Status_in_prism = billing_Plan_Status_in_prism;
	}
	public String getSeperation_Date() {
		return Seperation_Date;
	}
	public void setSeperation_Date(String seperation_Date) {
		Seperation_Date = seperation_Date;
	}
	public String getRelease_Reason() {
		return Release_Reason;
	}
	public void setRelease_Reason(String release_Reason) {
		Release_Reason = release_Reason;
	}
	public String getCompetence() {
		return Competence;
	}
	public void setCompetence(String competence) {
		Competence = competence;
	}
	public String getPrimary_Compentence_Area() {
		return Primary_Compentence_Area;
	}
	public void setPrimary_Compentence_Area(String primary_Compentence_Area) {
		Primary_Compentence_Area = primary_Compentence_Area;
	}
	public String getPrimary_Subskill1() {
		return Primary_Subskill1;
	}
	public void setPrimary_Subskill1(String primary_Subskill1) {
		Primary_Subskill1 = primary_Subskill1;
	}
	public String getSecondary_Competency_Area() {
		return Secondary_Competency_Area;
	}
	public void setSecondary_Competency_Area(String secondary_Competency_Area) {
		Secondary_Competency_Area = secondary_Competency_Area;
	}
	public String getSecondary_Subskill1() {
		return Secondary_Subskill1;
	}
	public void setSecondary_Subskill1(String secondary_Subskill1) {
		Secondary_Subskill1 = secondary_Subskill1;
	}
	
	
}
