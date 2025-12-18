package com.example.sql_project.Domain;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "test")
@Data
public class Market {

    @Id
    @Column(name = "ID", length = 250)
    private String id;

    @Column(name = "Time_Stamp", length = 100)
    private String timeStamp;

    @Column(name = "Date_Time", length = 100)
    private String dateTime;

    @Column(name = "Name_of_Client", length = 100)
    private String nameOfClient;

    @Column(name = "Mobile", length = 100)
    private String mobile;

    @Column(name = "Email_Id", length = 100)
    private String emailId;

    @Column(name = "Subjects", columnDefinition = "TEXT")
    private String subjects;

    @Column(name = "Notes", columnDefinition = "MEDIUMTEXT")
    private String notes;

    @Column(name = "IVR_Url", length = 200)
    private String ivrUrl;

    @Column(name = "WebSite_Name", length = 100)
    private String webSiteName;

    @Column(name = "Data_Source", length = 100)
    private String dataSource;

    @Column(name = "Assign_To_MR", length = 100)
    private String assignToMr;

    @Column(name = "Remarks_History", columnDefinition = "MEDIUMTEXT")
    private String remarksHistory;

    @Column(name = "Planned", length = 100)
    private String planned;

    @Column(name = "Actual", length = 100)
    private String actual;

    @Column(name = "Time_Delay", length = 100)
    private String timeDelay;

    @Column(name = "Status", length = 100)
    private String status;

    @Column(name = "Sample_New_Order_Form_Link", length = 100)
    private String sampleNewOrderFormLink;

    @Column(name = "Followup", length = 100)
    private String followup;

    @Column(name = "Remarks", columnDefinition = "MEDIUMTEXT")
    private String remarks;

    @Column(name = "Followup_Date", length = 100)
    private String followupDate;

    @Column(name = "Transfer_To", length = 100)
    private String transferTo;

    @Column(name = "Default_Contact_No", length = 100)
    private String defaultContactNo;

    @Column(name = "Default_Email_ID", length = 100)
    private String defaultEmailId;

    @Column(name = "Email_Sent", length = 100)
    private String emailSent;

    @Column(name = "WhatsApp_Sent", length = 100)
    private String whatsAppSent;

    @Column(name = "SMS_Sent", length = 100)
    private String smsSent;

    @Column(name = "Count_ID", length = 100)
    private String countId;

    @Column(name = "Email_Sent_Status", length = 100)
    private String emailSentStatus;

    @Column(name = "WhatsApp_Sent_Status", length = 100)
    private String whatsAppSentStatus;

    @Column(name = "SMS_Sent_Status", length = 100)
    private String smsSentStatus;

    @Column(name = "Order_Sales_Saved_Status", length = 100)
    private String orderSalesSavedStatus;

    @Column(name = "From_Sheet", length = 100)
    private String fromSheet;

    @Column(name = "blank_1", length = 100)
    private String blank1;

    @Column(name = "SQV_Lead_Intent", length = 100)
    private String sqvLeadIntent;

    @Column(name = "Lead_Priority", length = 100)
    private String leadPriority;

    @Column(name = "Duplicate", length = 100)
    private String duplicate;

    @Column(name = "Client_Category", length = 100)
    private String clientCategory;

    @Column(name = "blank_2", length = 100)
    private String blank2;

    @Column(name = "blank_3", length = 100)
    private String blank3;

    @Column(name = "blank_4", length = 100)
    private String blank4;

    @Column(name = "blank_5", length = 100)
    private String blank5;

    @Column(name = "blank_6", length = 100)
    private String blank6;

    @Column(name = "Transfer_to_SQL_Table", length = 100)
    private String transferToSqlTable;

    @Column(name = "Google_Drive_Call_Recording_URL", length = 100)
    private String googleDriveCallRecordingUrl;

    @Column(name = "Row_Duplicate_Mark", length = 100)
    private String rowDuplicateMark;

    @Column(name = "Call_Time", length = 100)
    private String callTime;

    @Column(name = "File_Size", length = 100)
    private String fileSize;

    @Column(name = "Exceptions_if_call_recording_not_found", length = 100)
    private String exceptionsIfCallRecordingNotFound;

    @Column(name = "NBD_CRR_Call", length = 100)
    private String nbdCrrCall;
}
