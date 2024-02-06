package com.melissadata;

public class mdProfiler {
	private long I;
	protected boolean ownMemory;

	protected static long getI(mdProfiler obj) {
		return (obj==null ? 0 : obj.I);
	}

	protected void finalize() {
		delete();
	}

public final static class ProgramStatus {
	public final static mdProfiler.ProgramStatus ErrorNone=new mdProfiler.ProgramStatus("ErrorNone",0);
	public final static mdProfiler.ProgramStatus ErrorConfigFile=new mdProfiler.ProgramStatus("ErrorConfigFile",1);
	public final static mdProfiler.ProgramStatus ErrorDatabaseExpired=new mdProfiler.ProgramStatus("ErrorDatabaseExpired",2);
	public final static mdProfiler.ProgramStatus ErrorLicenseExpired=new mdProfiler.ProgramStatus("ErrorLicenseExpired",3);
	public final static mdProfiler.ProgramStatus ErrorProfileFile=new mdProfiler.ProgramStatus("ErrorProfileFile",4);
	public final static mdProfiler.ProgramStatus ErrorUnknown=new mdProfiler.ProgramStatus("ErrorUnknown",5);

	private final String enumName;
	private final int enumValue;
	private static ProgramStatus[] enumValues={ErrorNone,ErrorConfigFile,ErrorDatabaseExpired,ErrorLicenseExpired,ErrorProfileFile,ErrorUnknown};

	private ProgramStatus(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static ProgramStatus toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+ProgramStatus.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class AppendMode {
	public final static mdProfiler.AppendMode Append=new mdProfiler.AppendMode("Append",0);
	public final static mdProfiler.AppendMode Report=new mdProfiler.AppendMode("Report",1);
	public final static mdProfiler.AppendMode Overwrite=new mdProfiler.AppendMode("Overwrite",2);
	public final static mdProfiler.AppendMode MustNotExist=new mdProfiler.AppendMode("MustNotExist",3);

	private final String enumName;
	private final int enumValue;
	private static AppendMode[] enumValues={Append,Report,Overwrite,MustNotExist};

	private AppendMode(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static AppendMode toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+AppendMode.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class ProfilerColumnType {
	public final static mdProfiler.ProfilerColumnType ColumnTypeInt1=new mdProfiler.ProfilerColumnType("ColumnTypeInt1",1);
	public final static mdProfiler.ProfilerColumnType ColumnTypeInt2=new mdProfiler.ProfilerColumnType("ColumnTypeInt2",2);
	public final static mdProfiler.ProfilerColumnType ColumnTypeInt4=new mdProfiler.ProfilerColumnType("ColumnTypeInt4",3);
	public final static mdProfiler.ProfilerColumnType ColumnTypeInt8=new mdProfiler.ProfilerColumnType("ColumnTypeInt8",4);
	public final static mdProfiler.ProfilerColumnType ColumnTypeUInt1=new mdProfiler.ProfilerColumnType("ColumnTypeUInt1",5);
	public final static mdProfiler.ProfilerColumnType ColumnTypeUInt2=new mdProfiler.ProfilerColumnType("ColumnTypeUInt2",6);
	public final static mdProfiler.ProfilerColumnType ColumnTypeUInt4=new mdProfiler.ProfilerColumnType("ColumnTypeUInt4",7);
	public final static mdProfiler.ProfilerColumnType ColumnTypeUInt8=new mdProfiler.ProfilerColumnType("ColumnTypeUInt8",8);
	public final static mdProfiler.ProfilerColumnType ColumnTypeReal4=new mdProfiler.ProfilerColumnType("ColumnTypeReal4",9);
	public final static mdProfiler.ProfilerColumnType ColumnTypeReal8=new mdProfiler.ProfilerColumnType("ColumnTypeReal8",10);
	public final static mdProfiler.ProfilerColumnType ColumnTypeNumeric=new mdProfiler.ProfilerColumnType("ColumnTypeNumeric",11);
	public final static mdProfiler.ProfilerColumnType ColumnTypeDecimal=new mdProfiler.ProfilerColumnType("ColumnTypeDecimal",12);
	public final static mdProfiler.ProfilerColumnType ColumnTypeCurrency=new mdProfiler.ProfilerColumnType("ColumnTypeCurrency",13);
	public final static mdProfiler.ProfilerColumnType ColumnTypeFixedMBCSString=new mdProfiler.ProfilerColumnType("ColumnTypeFixedMBCSString",14);
	public final static mdProfiler.ProfilerColumnType ColumnTypeVariableMBCSString=new mdProfiler.ProfilerColumnType("ColumnTypeVariableMBCSString",15);
	public final static mdProfiler.ProfilerColumnType ColumnTypeFixedUnicodeString=new mdProfiler.ProfilerColumnType("ColumnTypeFixedUnicodeString",16);
	public final static mdProfiler.ProfilerColumnType ColumnTypeVariableUnicodeString=new mdProfiler.ProfilerColumnType("ColumnTypeVariableUnicodeString",17);
	public final static mdProfiler.ProfilerColumnType ColumnTypeDate=new mdProfiler.ProfilerColumnType("ColumnTypeDate",18);
	public final static mdProfiler.ProfilerColumnType ColumnTypeDBDate=new mdProfiler.ProfilerColumnType("ColumnTypeDBDate",19);
	public final static mdProfiler.ProfilerColumnType ColumnTypeDBTime=new mdProfiler.ProfilerColumnType("ColumnTypeDBTime",20);
	public final static mdProfiler.ProfilerColumnType ColumnTypeDBTime2=new mdProfiler.ProfilerColumnType("ColumnTypeDBTime2",21);
	public final static mdProfiler.ProfilerColumnType ColumnTypeDBTimeStamp=new mdProfiler.ProfilerColumnType("ColumnTypeDBTimeStamp",22);
	public final static mdProfiler.ProfilerColumnType ColumnTypeDBTimeStamp2=new mdProfiler.ProfilerColumnType("ColumnTypeDBTimeStamp2",23);
	public final static mdProfiler.ProfilerColumnType ColumnTypeDBTimeStampOffset=new mdProfiler.ProfilerColumnType("ColumnTypeDBTimeStampOffset",24);
	public final static mdProfiler.ProfilerColumnType ColumnTypeFileTime=new mdProfiler.ProfilerColumnType("ColumnTypeFileTime",25);
	public final static mdProfiler.ProfilerColumnType ColumnTypeBoolean=new mdProfiler.ProfilerColumnType("ColumnTypeBoolean",26);
	public final static mdProfiler.ProfilerColumnType ColumnTypeGUID=new mdProfiler.ProfilerColumnType("ColumnTypeGUID",27);
	public final static mdProfiler.ProfilerColumnType ColumnTypeBytes=new mdProfiler.ProfilerColumnType("ColumnTypeBytes",28);
	public final static mdProfiler.ProfilerColumnType ColumnTypeImage=new mdProfiler.ProfilerColumnType("ColumnTypeImage",29);

	private final String enumName;
	private final int enumValue;
	private static ProfilerColumnType[] enumValues={ColumnTypeInt1,ColumnTypeInt2,ColumnTypeInt4,ColumnTypeInt8,ColumnTypeUInt1,ColumnTypeUInt2,ColumnTypeUInt4,ColumnTypeUInt8,ColumnTypeReal4,ColumnTypeReal8,ColumnTypeNumeric,ColumnTypeDecimal,ColumnTypeCurrency,ColumnTypeFixedMBCSString,ColumnTypeVariableMBCSString,ColumnTypeFixedUnicodeString,ColumnTypeVariableUnicodeString,ColumnTypeDate,ColumnTypeDBDate,ColumnTypeDBTime,ColumnTypeDBTime2,ColumnTypeDBTimeStamp,ColumnTypeDBTimeStamp2,ColumnTypeDBTimeStampOffset,ColumnTypeFileTime,ColumnTypeBoolean,ColumnTypeGUID,ColumnTypeBytes,ColumnTypeImage};

	private ProfilerColumnType(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static ProfilerColumnType toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+ProfilerColumnType.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class ProfilerDataType {
	public final static mdProfiler.ProfilerDataType DataTypeFullName=new mdProfiler.ProfilerDataType("DataTypeFullName",1);
	public final static mdProfiler.ProfilerDataType DataTypeInverseName=new mdProfiler.ProfilerDataType("DataTypeInverseName",2);
	public final static mdProfiler.ProfilerDataType DataTypeNamePrefix=new mdProfiler.ProfilerDataType("DataTypeNamePrefix",3);
	public final static mdProfiler.ProfilerDataType DataTypeFirstName=new mdProfiler.ProfilerDataType("DataTypeFirstName",4);
	public final static mdProfiler.ProfilerDataType DataTypeMiddleName=new mdProfiler.ProfilerDataType("DataTypeMiddleName",5);
	public final static mdProfiler.ProfilerDataType DataTypeLastName=new mdProfiler.ProfilerDataType("DataTypeLastName",6);
	public final static mdProfiler.ProfilerDataType DataTypeNameSuffix=new mdProfiler.ProfilerDataType("DataTypeNameSuffix",7);
	public final static mdProfiler.ProfilerDataType DataTypeTitle=new mdProfiler.ProfilerDataType("DataTypeTitle",8);
	public final static mdProfiler.ProfilerDataType DataTypeCompany=new mdProfiler.ProfilerDataType("DataTypeCompany",9);
	public final static mdProfiler.ProfilerDataType DataTypeAddress=new mdProfiler.ProfilerDataType("DataTypeAddress",10);
	public final static mdProfiler.ProfilerDataType DataTypeCity=new mdProfiler.ProfilerDataType("DataTypeCity",11);
	public final static mdProfiler.ProfilerDataType DataTypeStateOrProvince=new mdProfiler.ProfilerDataType("DataTypeStateOrProvince",12);
	public final static mdProfiler.ProfilerDataType DataTypeZipOrPostalCode=new mdProfiler.ProfilerDataType("DataTypeZipOrPostalCode",13);
	public final static mdProfiler.ProfilerDataType DataTypeCityStateZip=new mdProfiler.ProfilerDataType("DataTypeCityStateZip",14);
	public final static mdProfiler.ProfilerDataType DataTypeCountry=new mdProfiler.ProfilerDataType("DataTypeCountry",15);
	public final static mdProfiler.ProfilerDataType DataTypePhone=new mdProfiler.ProfilerDataType("DataTypePhone",16);
	public final static mdProfiler.ProfilerDataType DataTypeEmail=new mdProfiler.ProfilerDataType("DataTypeEmail",17);
	public final static mdProfiler.ProfilerDataType DataTypeString=new mdProfiler.ProfilerDataType("DataTypeString",18);
	public final static mdProfiler.ProfilerDataType DataTypeNumeric=new mdProfiler.ProfilerDataType("DataTypeNumeric",19);
	public final static mdProfiler.ProfilerDataType DataTypeDateMDY=new mdProfiler.ProfilerDataType("DataTypeDateMDY",20);
	public final static mdProfiler.ProfilerDataType DataTypeDateYMD=new mdProfiler.ProfilerDataType("DataTypeDateYMD",21);
	public final static mdProfiler.ProfilerDataType DataTypeDateDMY=new mdProfiler.ProfilerDataType("DataTypeDateDMY",22);
	public final static mdProfiler.ProfilerDataType DataTypeBoolean=new mdProfiler.ProfilerDataType("DataTypeBoolean",23);

	private final String enumName;
	private final int enumValue;
	private static ProfilerDataType[] enumValues={DataTypeFullName,DataTypeInverseName,DataTypeNamePrefix,DataTypeFirstName,DataTypeMiddleName,DataTypeLastName,DataTypeNameSuffix,DataTypeTitle,DataTypeCompany,DataTypeAddress,DataTypeCity,DataTypeStateOrProvince,DataTypeZipOrPostalCode,DataTypeCityStateZip,DataTypeCountry,DataTypePhone,DataTypeEmail,DataTypeString,DataTypeNumeric,DataTypeDateMDY,DataTypeDateYMD,DataTypeDateDMY,DataTypeBoolean};

	private ProfilerDataType(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static ProfilerDataType toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+ProfilerDataType.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class Sortation {
	public final static mdProfiler.Sortation SortUnknown=new mdProfiler.Sortation("SortUnknown",0);
	public final static mdProfiler.Sortation SortStringAscending=new mdProfiler.Sortation("SortStringAscending",1);
	public final static mdProfiler.Sortation SortStringDescending=new mdProfiler.Sortation("SortStringDescending",2);
	public final static mdProfiler.Sortation SortNumericAscending=new mdProfiler.Sortation("SortNumericAscending",3);
	public final static mdProfiler.Sortation SortNumericDescending=new mdProfiler.Sortation("SortNumericDescending",4);
	public final static mdProfiler.Sortation SortDateAscending=new mdProfiler.Sortation("SortDateAscending",5);
	public final static mdProfiler.Sortation SortDateDescending=new mdProfiler.Sortation("SortDateDescending",6);

	private final String enumName;
	private final int enumValue;
	private static Sortation[] enumValues={SortUnknown,SortStringAscending,SortStringDescending,SortNumericAscending,SortNumericDescending,SortDateAscending,SortDateDescending};

	private Sortation(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static Sortation toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+Sortation.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class Order {
	public final static mdProfiler.Order OrderNone=new mdProfiler.Order("OrderNone",0);
	public final static mdProfiler.Order OrderValueAscending=new mdProfiler.Order("OrderValueAscending",1);
	public final static mdProfiler.Order OrderValueDescending=new mdProfiler.Order("OrderValueDescending",2);
	public final static mdProfiler.Order OrderCountAscending=new mdProfiler.Order("OrderCountAscending",3);
	public final static mdProfiler.Order OrderCountDescending=new mdProfiler.Order("OrderCountDescending",4);

	private final String enumName;
	private final int enumValue;
	private static Order[] enumValues={OrderNone,OrderValueAscending,OrderValueDescending,OrderCountAscending,OrderCountDescending};

	private Order(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static Order toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+Order.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

public final static class DateSpan {
	public final static mdProfiler.DateSpan DateSpanDate=new mdProfiler.DateSpan("DateSpanDate",1);
	public final static mdProfiler.DateSpan DateSpanTime=new mdProfiler.DateSpan("DateSpanTime",2);
	public final static mdProfiler.DateSpan DateSpanHour=new mdProfiler.DateSpan("DateSpanHour",3);
	public final static mdProfiler.DateSpan DateSpanMinute=new mdProfiler.DateSpan("DateSpanMinute",4);
	public final static mdProfiler.DateSpan DateSpanSecond=new mdProfiler.DateSpan("DateSpanSecond",5);
	public final static mdProfiler.DateSpan DateSpanMillisecond=new mdProfiler.DateSpan("DateSpanMillisecond",6);
	public final static mdProfiler.DateSpan DateSpanDayOfWeek=new mdProfiler.DateSpan("DateSpanDayOfWeek",7);
	public final static mdProfiler.DateSpan DateSpanDay=new mdProfiler.DateSpan("DateSpanDay",8);
	public final static mdProfiler.DateSpan DateSpanWeek=new mdProfiler.DateSpan("DateSpanWeek",9);
	public final static mdProfiler.DateSpan DateSpanMonth=new mdProfiler.DateSpan("DateSpanMonth",10);
	public final static mdProfiler.DateSpan DateSpanQuarter=new mdProfiler.DateSpan("DateSpanQuarter",11);
	public final static mdProfiler.DateSpan DateSpanYear=new mdProfiler.DateSpan("DateSpanYear",12);
	public final static mdProfiler.DateSpan DateSpanDecade=new mdProfiler.DateSpan("DateSpanDecade",13);
	public final static mdProfiler.DateSpan DateSpanCentury=new mdProfiler.DateSpan("DateSpanCentury",14);

	private final String enumName;
	private final int enumValue;
	private static DateSpan[] enumValues={DateSpanDate,DateSpanTime,DateSpanHour,DateSpanMinute,DateSpanSecond,DateSpanMillisecond,DateSpanDayOfWeek,DateSpanDay,DateSpanWeek,DateSpanMonth,DateSpanQuarter,DateSpanYear,DateSpanDecade,DateSpanCentury};

	private DateSpan(String name,int val) {
		enumName=name;
		enumValue=val;
	}

	public static DateSpan toEnum(int val) {
		for (int i=0;i<enumValues.length;i++)
			if (enumValues[i].enumValue==val)
				return enumValues[i];
		throw new IllegalArgumentException("No enum "+DateSpan.class+" with value "+val+".");
	}

	public String toString() {
		return enumName;
	}

	public int toValue() {
		return enumValue;
	}
}

	protected mdProfiler(long i,boolean own) {
		ownMemory=own;
		I=i;
	}

	public mdProfiler() {
		this(mdProfilerJNI.mdProfilerCreate(),true);
	}

	public synchronized void delete() {
		if (I!=0) {
			if (ownMemory) {
				ownMemory=false;
				mdProfilerJNI.mdProfilerDestroy(I);
			}
			I=0;
		}
	}

	public int SetLicenseString(String license) {
		return mdProfilerJNI.SetLicenseString(I,license);
	}

	public void SetPathToProfilerDataFiles(String path) {
		mdProfilerJNI.SetPathToProfilerDataFiles(I,path);
	}

	public void SetFileName(String fileName) {
		mdProfilerJNI.SetFileName(I,fileName);
	}

	public void SetAppendMode(mdProfiler.AppendMode appendMode) {
		mdProfilerJNI.SetAppendMode(I,appendMode.toValue());
	}

	public void SetUserName(String userName) {
		mdProfilerJNI.SetUserName(I,userName);
	}

	public String GetUserName() {
		return mdProfilerJNI.GetUserName(I);
	}

	public void SetTableName(String tableName) {
		mdProfilerJNI.SetTableName(I,tableName);
	}

	public String GetTableName() {
		return mdProfilerJNI.GetTableName(I);
	}

	public void SetJobName(String jobName) {
		mdProfilerJNI.SetJobName(I,jobName);
	}

	public String GetJobName() {
		return mdProfilerJNI.GetJobName(I);
	}

	public void SetJobDescription(String jobDescription) {
		mdProfilerJNI.SetJobDescription(I,jobDescription);
	}

	public String GetJobDescription() {
		return mdProfilerJNI.GetJobDescription(I);
	}

	public void SetSortAnalysis(int sortAnalysis) {
		mdProfilerJNI.SetSortAnalysis(I,sortAnalysis);
	}

	public void SetMatchUpAnalysis(int matchUpAnalysis) {
		mdProfilerJNI.SetMatchUpAnalysis(I,matchUpAnalysis);
	}

	public void SetRightFielderAnalysis(int rightFielderAnalysis) {
		mdProfilerJNI.SetRightFielderAnalysis(I,rightFielderAnalysis);
	}

	public void SetDataAggregation(int dataAggregation) {
		mdProfilerJNI.SetDataAggregation(I,dataAggregation);
	}

	public ProgramStatus InitializeDataFiles() {
		return ProgramStatus.toEnum(mdProfilerJNI.InitializeDataFiles(I));
	}

	public String GetInitializeErrorString() {
		return mdProfilerJNI.GetInitializeErrorString(I);
	}

	public String GetBuildNumber() {
		return mdProfilerJNI.GetBuildNumber(I);
	}

	public String GetDatabaseDate() {
		return mdProfilerJNI.GetDatabaseDate(I);
	}

	public String GetLicenseExpirationDate() {
		return mdProfilerJNI.GetLicenseExpirationDate(I);
	}

	public String GetProfileStartDateTime() {
		return mdProfilerJNI.GetProfileStartDateTime(I);
	}

	public String GetProfileEndDateTime() {
		return mdProfilerJNI.GetProfileEndDateTime(I);
	}

	public String GetColumnTypeEnum() {
		return mdProfilerJNI.GetColumnTypeEnum(I);
	}

	public String GetColumnTypeDescription(mdProfiler.ProfilerColumnType columnType) {
		return mdProfilerJNI.GetColumnTypeDescription(I,columnType.toValue());
	}

	public ProfilerColumnType ParseColumnTypeDescription(String columnTypeStr) {
		return ProfilerColumnType.toEnum(mdProfilerJNI.ParseColumnTypeDescription(I,columnTypeStr));
	}

	public String GetDataTypeEnum() {
		return mdProfilerJNI.GetDataTypeEnum(I);
	}

	public String GetDataTypeDescription(mdProfiler.ProfilerDataType dataType) {
		return mdProfilerJNI.GetDataTypeDescription(I,dataType.toValue());
	}

	public ProfilerDataType ParseDataTypeDescription(String dataTypeStr) {
		return ProfilerDataType.toEnum(mdProfilerJNI.ParseDataTypeDescription(I,dataTypeStr));
	}

	public String GetResultCodeEnum() {
		return mdProfilerJNI.GetResultCodeEnum(I);
	}

	public String GetResultCodeDescription(String resultStr) {
		return mdProfilerJNI.GetResultCodeDescription(I,resultStr);
	}

	public void AddColumn(String columnName, mdProfiler.ProfilerColumnType columnType, mdProfiler.ProfilerDataType dataType) {
		mdProfilerJNI.AddColumn(I,columnName,columnType.toValue(),dataType.toValue());
	}

	public int SetColumnCustomPattern(String columnName, String regEx) {
		return mdProfilerJNI.SetColumnCustomPattern(I,columnName,regEx);
	}

	public int SetColumnValueRange(String columnName, String fromStr, String toStr) {
		return mdProfilerJNI.SetColumnValueRange(I,columnName,fromStr,toStr);
	}

	public int SetColumnDefaultValue(String columnName, String value) {
		return mdProfilerJNI.SetColumnDefaultValue(I,columnName,value);
	}

	public void SetColumnSize(String columnName, int size) {
		mdProfilerJNI.SetColumnSize(I,columnName,size);
	}

	public void SetColumnPrecision(String columnName, int precision) {
		mdProfilerJNI.SetColumnPrecision(I,columnName,precision);
	}

	public void SetColumnScale(String columnName, int scale) {
		mdProfilerJNI.SetColumnScale(I,columnName,scale);
	}

	public void SetColumnIgnoreOnError(String columnName, int ignore) {
		mdProfilerJNI.SetColumnIgnoreOnError(I,columnName,ignore);
	}

	public void StartProfiling() {
		mdProfilerJNI.StartProfiling(I);
	}

	public void SetColumn(String columnName, String content) {
		mdProfilerJNI.SetColumn(I,columnName,content);
	}

	public void SetColumnNull(String columnName) {
		mdProfilerJNI.SetColumnNull(I,columnName);
	}

	public String GetColumnValue(String columnName) {
		return mdProfilerJNI.GetColumnValue(I,columnName);
	}

	public void AddRecord() {
		mdProfilerJNI.AddRecord(I);
	}

	public String GetResults(String columnName) {
		return mdProfilerJNI.GetResults(I,columnName);
	}

	public void SetTextQualifier(String qualifier) {
		mdProfilerJNI.SetTextQualifier(I,qualifier);
	}

	public void SetColumnDelimiter(String delimiter) {
		mdProfilerJNI.SetColumnDelimiter(I,delimiter);
	}

	public void SetRowDelimiter(String delimiter) {
		mdProfilerJNI.SetRowDelimiter(I,delimiter);
	}

	public String AddDelimitedRecord(String record) {
		return mdProfilerJNI.AddDelimitedRecord(I,record);
	}

	public void ProfileData() {
		mdProfilerJNI.ProfileData(I);
	}

	public int GetTableRecordCount() {
		return mdProfilerJNI.GetTableRecordCount(I);
	}

	public int GetTableRecordEmptyCount() {
		return mdProfilerJNI.GetTableRecordEmptyCount(I);
	}

	public int GetTableRecordNullCount() {
		return mdProfilerJNI.GetTableRecordNullCount(I);
	}

	public int GetTableEmbeddedRowDelimiterCount() {
		return mdProfilerJNI.GetTableEmbeddedRowDelimiterCount(I);
	}

	public int GetTableNotAllFieldsPresentCount() {
		return mdProfilerJNI.GetTableNotAllFieldsPresentCount(I);
	}

	public int GetTableExtraFieldsPresentCount() {
		return mdProfilerJNI.GetTableExtraFieldsPresentCount(I);
	}

	public int GetTableUnbalancedTextQualifiersCount() {
		return mdProfilerJNI.GetTableUnbalancedTextQualifiersCount(I);
	}

	public int GetTableUnescapedEmbeddedTextQualifiersCount() {
		return mdProfilerJNI.GetTableUnescapedEmbeddedTextQualifiersCount(I);
	}

	public int GetTableExactMatchDistinctCount() {
		return mdProfilerJNI.GetTableExactMatchDistinctCount(I);
	}

	public int GetTableExactMatchDupesCount() {
		return mdProfilerJNI.GetTableExactMatchDupesCount(I);
	}

	public int GetTableExactMatchLargestGroup() {
		return mdProfilerJNI.GetTableExactMatchLargestGroup(I);
	}

	public int GetTableContactMatchDistinctCount() {
		return mdProfilerJNI.GetTableContactMatchDistinctCount(I);
	}

	public int GetTableContactMatchDupesCount() {
		return mdProfilerJNI.GetTableContactMatchDupesCount(I);
	}

	public int GetTableContactMatchLargestGroup() {
		return mdProfilerJNI.GetTableContactMatchLargestGroup(I);
	}

	public int GetTableHouseholdMatchDistinctCount() {
		return mdProfilerJNI.GetTableHouseholdMatchDistinctCount(I);
	}

	public int GetTableHouseholdMatchDupesCount() {
		return mdProfilerJNI.GetTableHouseholdMatchDupesCount(I);
	}

	public int GetTableHouseholdMatchLargestGroup() {
		return mdProfilerJNI.GetTableHouseholdMatchLargestGroup(I);
	}

	public int GetTableAddressMatchDistinctCount() {
		return mdProfilerJNI.GetTableAddressMatchDistinctCount(I);
	}

	public int GetTableAddressMatchDupesCount() {
		return mdProfilerJNI.GetTableAddressMatchDupesCount(I);
	}

	public int GetTableAddressMatchLargestGroup() {
		return mdProfilerJNI.GetTableAddressMatchLargestGroup(I);
	}

	public int GetColumnCount() {
		return mdProfilerJNI.GetColumnCount(I);
	}

	public String GetColumnName(int index) {
		return mdProfilerJNI.GetColumnName(I,index);
	}

	public ProfilerColumnType GetColumnColumnType(String columnName) {
		return ProfilerColumnType.toEnum(mdProfilerJNI.GetColumnColumnType(I,columnName));
	}

	public ProfilerDataType GetColumnDataType(String columnName) {
		return ProfilerDataType.toEnum(mdProfilerJNI.GetColumnDataType(I,columnName));
	}

	public int GetColumnSize(String columnName) {
		return mdProfilerJNI.GetColumnSize(I,columnName);
	}

	public int GetColumnPrecision(String columnName) {
		return mdProfilerJNI.GetColumnPrecision(I,columnName);
	}

	public int GetColumnScale(String columnName) {
		return mdProfilerJNI.GetColumnScale(I,columnName);
	}

	public String GetColumnValueRangeFrom(String columnName) {
		return mdProfilerJNI.GetColumnValueRangeFrom(I,columnName);
	}

	public String GetColumnValueRangeTo(String columnName) {
		return mdProfilerJNI.GetColumnValueRangeTo(I,columnName);
	}

	public String GetColumnDefaultValue(String columnName) {
		return mdProfilerJNI.GetColumnDefaultValue(I,columnName);
	}

	public String GetColumnCustomPatterns(String columnName) {
		return mdProfilerJNI.GetColumnCustomPatterns(I,columnName);
	}

	public ProfilerDataType GetColumnInferredDataType(String columnName) {
		return ProfilerDataType.toEnum(mdProfilerJNI.GetColumnInferredDataType(I,columnName));
	}

	public ProfilerColumnType GetColumnInferredColumnType(String columnName) {
		return ProfilerColumnType.toEnum(mdProfilerJNI.GetColumnInferredColumnType(I,columnName));
	}

	public Sortation GetColumnSortation(String columnName) {
		return Sortation.toEnum(mdProfilerJNI.GetColumnSortation(I,columnName));
	}

	public double GetColumnSortationPercent(String columnName) {
		return mdProfilerJNI.GetColumnSortationPercent(I,columnName);
	}

	public int GetColumnMostPopularCount(String columnName) {
		return mdProfilerJNI.GetColumnMostPopularCount(I,columnName);
	}

	public int GetColumnDistinctCount(String columnName) {
		return mdProfilerJNI.GetColumnDistinctCount(I,columnName);
	}

	public int GetColumnUniqueCount(String columnName) {
		return mdProfilerJNI.GetColumnUniqueCount(I,columnName);
	}

	public int GetColumnDefaultValueCount(String columnName) {
		return mdProfilerJNI.GetColumnDefaultValueCount(I,columnName);
	}

	public int GetColumnBelowRangeCount(String columnName) {
		return mdProfilerJNI.GetColumnBelowRangeCount(I,columnName);
	}

	public int GetColumnAboveRangeCount(String columnName) {
		return mdProfilerJNI.GetColumnAboveRangeCount(I,columnName);
	}

	public int GetColumnAboveSizeCount(String columnName) {
		return mdProfilerJNI.GetColumnAboveSizeCount(I,columnName);
	}

	public int GetColumnAbovePrecisionCount(String columnName) {
		return mdProfilerJNI.GetColumnAbovePrecisionCount(I,columnName);
	}

	public int GetColumnAboveScaleCount(String columnName) {
		return mdProfilerJNI.GetColumnAboveScaleCount(I,columnName);
	}

	public int GetColumnInvalidRegExCount(String columnName) {
		return mdProfilerJNI.GetColumnInvalidRegExCount(I,columnName);
	}

	public int GetColumnEmptyCount(String columnName) {
		return mdProfilerJNI.GetColumnEmptyCount(I,columnName);
	}

	public int GetColumnNullCount(String columnName) {
		return mdProfilerJNI.GetColumnNullCount(I,columnName);
	}

	public int GetColumnInvalidDataCount(String columnName) {
		return mdProfilerJNI.GetColumnInvalidDataCount(I,columnName);
	}

	public int GetColumnInvalidUTF8Count(String columnName) {
		return mdProfilerJNI.GetColumnInvalidUTF8Count(I,columnName);
	}

	public int GetColumnNonPrintingCharCount(String columnName) {
		return mdProfilerJNI.GetColumnNonPrintingCharCount(I,columnName);
	}

	public int GetColumnDiacriticCharCount(String columnName) {
		return mdProfilerJNI.GetColumnDiacriticCharCount(I,columnName);
	}

	public int GetColumnForeignCharCount(String columnName) {
		return mdProfilerJNI.GetColumnForeignCharCount(I,columnName);
	}

	public int GetColumnAlphaOnlyCount(String columnName) {
		return mdProfilerJNI.GetColumnAlphaOnlyCount(I,columnName);
	}

	public int GetColumnNumericOnlyCount(String columnName) {
		return mdProfilerJNI.GetColumnNumericOnlyCount(I,columnName);
	}

	public int GetColumnAlphaNumericCount(String columnName) {
		return mdProfilerJNI.GetColumnAlphaNumericCount(I,columnName);
	}

	public int GetColumnUpperCaseOnlyCount(String columnName) {
		return mdProfilerJNI.GetColumnUpperCaseOnlyCount(I,columnName);
	}

	public int GetColumnLowerCaseOnlyCount(String columnName) {
		return mdProfilerJNI.GetColumnLowerCaseOnlyCount(I,columnName);
	}

	public int GetColumnMixedCaseCount(String columnName) {
		return mdProfilerJNI.GetColumnMixedCaseCount(I,columnName);
	}

	public int GetColumnSingleSpaceCount(String columnName) {
		return mdProfilerJNI.GetColumnSingleSpaceCount(I,columnName);
	}

	public int GetColumnMultiSpaceCount(String columnName) {
		return mdProfilerJNI.GetColumnMultiSpaceCount(I,columnName);
	}

	public int GetColumnLeadingSpaceCount(String columnName) {
		return mdProfilerJNI.GetColumnLeadingSpaceCount(I,columnName);
	}

	public int GetColumnTrailingSpaceCount(String columnName) {
		return mdProfilerJNI.GetColumnTrailingSpaceCount(I,columnName);
	}

	public int GetColumnMaxSpaces(String columnName) {
		return mdProfilerJNI.GetColumnMaxSpaces(I,columnName);
	}

	public int GetColumnMinSpaces(String columnName) {
		return mdProfilerJNI.GetColumnMinSpaces(I,columnName);
	}

	public int GetColumnTotalSpaces(String columnName) {
		return mdProfilerJNI.GetColumnTotalSpaces(I,columnName);
	}

	public int GetColumnTotalWordBreaks(String columnName) {
		return mdProfilerJNI.GetColumnTotalWordBreaks(I,columnName);
	}

	public double GetColumnAvgSpaces(String columnName) {
		return mdProfilerJNI.GetColumnAvgSpaces(I,columnName);
	}

	public int GetColumnDecorationCharCount(String columnName) {
		return mdProfilerJNI.GetColumnDecorationCharCount(I,columnName);
	}

	public int GetColumnProfanityCount(String columnName) {
		return mdProfilerJNI.GetColumnProfanityCount(I,columnName);
	}

	public int GetColumnInconsistentDataCount(String columnName) {
		return mdProfilerJNI.GetColumnInconsistentDataCount(I,columnName);
	}

	public String GetColumnStringMaxValue(String columnName) {
		return mdProfilerJNI.GetColumnStringMaxValue(I,columnName);
	}

	public String GetColumnStringMinValue(String columnName) {
		return mdProfilerJNI.GetColumnStringMinValue(I,columnName);
	}

	public String GetColumnStringQ1Value(String columnName) {
		return mdProfilerJNI.GetColumnStringQ1Value(I,columnName);
	}

	public String GetColumnStringMedValue(String columnName) {
		return mdProfilerJNI.GetColumnStringMedValue(I,columnName);
	}

	public String GetColumnStringQ3Value(String columnName) {
		return mdProfilerJNI.GetColumnStringQ3Value(I,columnName);
	}

	public int GetColumnStringMaxLength(String columnName) {
		return mdProfilerJNI.GetColumnStringMaxLength(I,columnName);
	}

	public int GetColumnStringMinLength(String columnName) {
		return mdProfilerJNI.GetColumnStringMinLength(I,columnName);
	}

	public double GetColumnStringAvgLength(String columnName) {
		return mdProfilerJNI.GetColumnStringAvgLength(I,columnName);
	}

	public int GetColumnStringQ1Length(String columnName) {
		return mdProfilerJNI.GetColumnStringQ1Length(I,columnName);
	}

	public int GetColumnStringMedLength(String columnName) {
		return mdProfilerJNI.GetColumnStringMedLength(I,columnName);
	}

	public int GetColumnStringQ3Length(String columnName) {
		return mdProfilerJNI.GetColumnStringQ3Length(I,columnName);
	}

	public String GetColumnWordMaxValue(String columnName) {
		return mdProfilerJNI.GetColumnWordMaxValue(I,columnName);
	}

	public String GetColumnWordMinValue(String columnName) {
		return mdProfilerJNI.GetColumnWordMinValue(I,columnName);
	}

	public String GetColumnWordQ1Value(String columnName) {
		return mdProfilerJNI.GetColumnWordQ1Value(I,columnName);
	}

	public String GetColumnWordMedValue(String columnName) {
		return mdProfilerJNI.GetColumnWordMedValue(I,columnName);
	}

	public String GetColumnWordQ3Value(String columnName) {
		return mdProfilerJNI.GetColumnWordQ3Value(I,columnName);
	}

	public int GetColumnWordMaxLength(String columnName) {
		return mdProfilerJNI.GetColumnWordMaxLength(I,columnName);
	}

	public int GetColumnWordMinLength(String columnName) {
		return mdProfilerJNI.GetColumnWordMinLength(I,columnName);
	}

	public double GetColumnWordAvgLength(String columnName) {
		return mdProfilerJNI.GetColumnWordAvgLength(I,columnName);
	}

	public int GetColumnWordQ1Length(String columnName) {
		return mdProfilerJNI.GetColumnWordQ1Length(I,columnName);
	}

	public int GetColumnWordMedLength(String columnName) {
		return mdProfilerJNI.GetColumnWordMedLength(I,columnName);
	}

	public int GetColumnWordQ3Length(String columnName) {
		return mdProfilerJNI.GetColumnWordQ3Length(I,columnName);
	}

	public int GetColumnMaxWords(String columnName) {
		return mdProfilerJNI.GetColumnMaxWords(I,columnName);
	}

	public int GetColumnMinWords(String columnName) {
		return mdProfilerJNI.GetColumnMinWords(I,columnName);
	}

	public double GetColumnAvgWords(String columnName) {
		return mdProfilerJNI.GetColumnAvgWords(I,columnName);
	}

	public double GetColumnNumericMaxValue(String columnName) {
		return mdProfilerJNI.GetColumnNumericMaxValue(I,columnName);
	}

	public double GetColumnNumericMinValue(String columnName) {
		return mdProfilerJNI.GetColumnNumericMinValue(I,columnName);
	}

	public double GetColumnNumericAvgValue(String columnName) {
		return mdProfilerJNI.GetColumnNumericAvgValue(I,columnName);
	}

	public double GetColumnNumericQ1Value(String columnName) {
		return mdProfilerJNI.GetColumnNumericQ1Value(I,columnName);
	}

	public double GetColumnNumericQ1IntValue(String columnName) {
		return mdProfilerJNI.GetColumnNumericQ1IntValue(I,columnName);
	}

	public double GetColumnNumericMedValue(String columnName) {
		return mdProfilerJNI.GetColumnNumericMedValue(I,columnName);
	}

	public double GetColumnNumericMedIntValue(String columnName) {
		return mdProfilerJNI.GetColumnNumericMedIntValue(I,columnName);
	}

	public double GetColumnNumericQ3Value(String columnName) {
		return mdProfilerJNI.GetColumnNumericQ3Value(I,columnName);
	}

	public double GetColumnNumericQ3IntValue(String columnName) {
		return mdProfilerJNI.GetColumnNumericQ3IntValue(I,columnName);
	}

	public double GetColumnNumericStdDevValue(String columnName) {
		return mdProfilerJNI.GetColumnNumericStdDevValue(I,columnName);
	}

	public String GetColumnDateMaxValue(String columnName) {
		return mdProfilerJNI.GetColumnDateMaxValue(I,columnName);
	}

	public String GetColumnDateMinValue(String columnName) {
		return mdProfilerJNI.GetColumnDateMinValue(I,columnName);
	}

	public String GetColumnDateAvgValue(String columnName) {
		return mdProfilerJNI.GetColumnDateAvgValue(I,columnName);
	}

	public String GetColumnDateQ1Value(String columnName) {
		return mdProfilerJNI.GetColumnDateQ1Value(I,columnName);
	}

	public String GetColumnDateMedValue(String columnName) {
		return mdProfilerJNI.GetColumnDateMedValue(I,columnName);
	}

	public String GetColumnDateQ3Value(String columnName) {
		return mdProfilerJNI.GetColumnDateQ3Value(I,columnName);
	}

	public String GetColumnTimeMaxValue(String columnName) {
		return mdProfilerJNI.GetColumnTimeMaxValue(I,columnName);
	}

	public String GetColumnTimeMinValue(String columnName) {
		return mdProfilerJNI.GetColumnTimeMinValue(I,columnName);
	}

	public String GetColumnTimeAvgValue(String columnName) {
		return mdProfilerJNI.GetColumnTimeAvgValue(I,columnName);
	}

	public String GetColumnTimeQ1Value(String columnName) {
		return mdProfilerJNI.GetColumnTimeQ1Value(I,columnName);
	}

	public String GetColumnTimeMedValue(String columnName) {
		return mdProfilerJNI.GetColumnTimeMedValue(I,columnName);
	}

	public String GetColumnTimeQ3Value(String columnName) {
		return mdProfilerJNI.GetColumnTimeQ3Value(I,columnName);
	}

	public int GetColumnDateNoCenturyCount(String columnName) {
		return mdProfilerJNI.GetColumnDateNoCenturyCount(I,columnName);
	}

	public int GetColumnNameInconsistentOrderCount(String columnName) {
		return mdProfilerJNI.GetColumnNameInconsistentOrderCount(I,columnName);
	}

	public int GetColumnNameMultipleNameCount(String columnName) {
		return mdProfilerJNI.GetColumnNameMultipleNameCount(I,columnName);
	}

	public int GetColumnNameSuspiciousNameCount(String columnName) {
		return mdProfilerJNI.GetColumnNameSuspiciousNameCount(I,columnName);
	}

	public int GetColumnStateCount(String columnName) {
		return mdProfilerJNI.GetColumnStateCount(I,columnName);
	}

	public int GetColumnProvinceCount(String columnName) {
		return mdProfilerJNI.GetColumnProvinceCount(I,columnName);
	}

	public int GetColumnStateProvinceNonStandardCount(String columnName) {
		return mdProfilerJNI.GetColumnStateProvinceNonStandardCount(I,columnName);
	}

	public int GetColumnStateProvinceInvalidCount(String columnName) {
		return mdProfilerJNI.GetColumnStateProvinceInvalidCount(I,columnName);
	}

	public int GetColumnZipCodeCount(String columnName) {
		return mdProfilerJNI.GetColumnZipCodeCount(I,columnName);
	}

	public int GetColumnPlus4Count(String columnName) {
		return mdProfilerJNI.GetColumnPlus4Count(I,columnName);
	}

	public int GetColumnZipCodeInvalidCount(String columnName) {
		return mdProfilerJNI.GetColumnZipCodeInvalidCount(I,columnName);
	}

	public int GetColumnPostalCodeCount(String columnName) {
		return mdProfilerJNI.GetColumnPostalCodeCount(I,columnName);
	}

	public int GetColumnPostalCodeInvalidCount(String columnName) {
		return mdProfilerJNI.GetColumnPostalCodeInvalidCount(I,columnName);
	}

	public int GetColumnZipCodePostalCodeInvalidCount(String columnName) {
		return mdProfilerJNI.GetColumnZipCodePostalCodeInvalidCount(I,columnName);
	}

	public int GetColumnStateZipCodeMismatchCount(String columnName) {
		return mdProfilerJNI.GetColumnStateZipCodeMismatchCount(I,columnName);
	}

	public int GetColumnProvincePostalCodeMismatchCount(String columnName) {
		return mdProfilerJNI.GetColumnProvincePostalCodeMismatchCount(I,columnName);
	}

	public int GetColumnCountryNonStandardCount(String columnName) {
		return mdProfilerJNI.GetColumnCountryNonStandardCount(I,columnName);
	}

	public int GetColumnCountryInvalidCount(String columnName) {
		return mdProfilerJNI.GetColumnCountryInvalidCount(I,columnName);
	}

	public int GetColumnEmailSyntaxCount(String columnName) {
		return mdProfilerJNI.GetColumnEmailSyntaxCount(I,columnName);
	}

	public int GetColumnEmailMobileDomainCount(String columnName) {
		return mdProfilerJNI.GetColumnEmailMobileDomainCount(I,columnName);
	}

	public int GetColumnEmailMisspelledDomainCount(String columnName) {
		return mdProfilerJNI.GetColumnEmailMisspelledDomainCount(I,columnName);
	}

	public int GetColumnEmailSpamtrapDomainCount(String columnName) {
		return mdProfilerJNI.GetColumnEmailSpamtrapDomainCount(I,columnName);
	}

	public int GetColumnEmailDisposableDomainCount(String columnName) {
		return mdProfilerJNI.GetColumnEmailDisposableDomainCount(I,columnName);
	}

	public int GetColumnPhoneInvalidCount(String columnName) {
		return mdProfilerJNI.GetColumnPhoneInvalidCount(I,columnName);
	}

	public int StartDataFrequency(String columnName, mdProfiler.Order order) {
		return mdProfilerJNI.StartDataFrequency(I,columnName,order.toValue());
	}

	public String GetDataFrequencyValue(String columnName) {
		return mdProfilerJNI.GetDataFrequencyValue(I,columnName);
	}

	public int GetDataFrequencyCount(String columnName) {
		return mdProfilerJNI.GetDataFrequencyCount(I,columnName);
	}

	public int GetNextDataFrequency(String columnName) {
		return mdProfilerJNI.GetNextDataFrequency(I,columnName);
	}

	public int StartLengthFrequency(String columnName, mdProfiler.Order order) {
		return mdProfilerJNI.StartLengthFrequency(I,columnName,order.toValue());
	}

	public int GetLengthFrequencyValue(String columnName) {
		return mdProfilerJNI.GetLengthFrequencyValue(I,columnName);
	}

	public int GetLengthFrequencyCount(String columnName) {
		return mdProfilerJNI.GetLengthFrequencyCount(I,columnName);
	}

	public int GetNextLengthFrequency(String columnName) {
		return mdProfilerJNI.GetNextLengthFrequency(I,columnName);
	}

	public int StartPatternFrequency(String columnName, mdProfiler.Order order) {
		return mdProfilerJNI.StartPatternFrequency(I,columnName,order.toValue());
	}

	public String GetPatternFrequencyValue(String columnName) {
		return mdProfilerJNI.GetPatternFrequencyValue(I,columnName);
	}

	public String GetPatternFrequencyRegEx(String columnName) {
		return mdProfilerJNI.GetPatternFrequencyRegEx(I,columnName);
	}

	public String GetPatternFrequencyExample(String columnName) {
		return mdProfilerJNI.GetPatternFrequencyExample(I,columnName);
	}

	public int GetPatternFrequencyCount(String columnName) {
		return mdProfilerJNI.GetPatternFrequencyCount(I,columnName);
	}

	public int GetNextPatternFrequency(String columnName) {
		return mdProfilerJNI.GetNextPatternFrequency(I,columnName);
	}

	public int StartDateFrequency(String columnName, mdProfiler.Order order, mdProfiler.DateSpan dateSpan) {
		return mdProfilerJNI.StartDateFrequency(I,columnName,order.toValue(),dateSpan.toValue());
	}

	public String GetDateFrequencyValue(String columnName) {
		return mdProfilerJNI.GetDateFrequencyValue(I,columnName);
	}

	public int GetDateFrequencyCount(String columnName) {
		return mdProfilerJNI.GetDateFrequencyCount(I,columnName);
	}

	public int GetNextDateFrequency(String columnName) {
		return mdProfilerJNI.GetNextDateFrequency(I,columnName);
	}

	public int StartSoundExFrequency(String columnName, mdProfiler.Order order) {
		return mdProfilerJNI.StartSoundExFrequency(I,columnName,order.toValue());
	}

	public String GetSoundExFrequencyValue(String columnName) {
		return mdProfilerJNI.GetSoundExFrequencyValue(I,columnName);
	}

	public String GetSoundExFrequencyExample(String columnName) {
		return mdProfilerJNI.GetSoundExFrequencyExample(I,columnName);
	}

	public int GetSoundExFrequencyCount(String columnName) {
		return mdProfilerJNI.GetSoundExFrequencyCount(I,columnName);
	}

	public int GetNextSoundExFrequency(String columnName) {
		return mdProfilerJNI.GetNextSoundExFrequency(I,columnName);
	}

	public int StartWordFrequency(String columnName, mdProfiler.Order order) {
		return mdProfilerJNI.StartWordFrequency(I,columnName,order.toValue());
	}

	public String GetWordFrequencyValue(String columnName) {
		return mdProfilerJNI.GetWordFrequencyValue(I,columnName);
	}

	public int GetWordFrequencyCount(String columnName) {
		return mdProfilerJNI.GetWordFrequencyCount(I,columnName);
	}

	public int GetNextWordFrequency(String columnName) {
		return mdProfilerJNI.GetNextWordFrequency(I,columnName);
	}

	public int StartWordLengthFrequency(String columnName, mdProfiler.Order order) {
		return mdProfilerJNI.StartWordLengthFrequency(I,columnName,order.toValue());
	}

	public int GetWordLengthFrequencyValue(String columnName) {
		return mdProfilerJNI.GetWordLengthFrequencyValue(I,columnName);
	}

	public int GetWordLengthFrequencyCount(String columnName) {
		return mdProfilerJNI.GetWordLengthFrequencyCount(I,columnName);
	}

	public int GetNextWordLengthFrequency(String columnName) {
		return mdProfilerJNI.GetNextWordLengthFrequency(I,columnName);
	}

	public void SetReserved(String key, String value) {
		mdProfilerJNI.SetReserved(I,key,value);
	}

	public String GetReserved(String key) {
		return mdProfilerJNI.GetReserved(I,key);
	}

}
