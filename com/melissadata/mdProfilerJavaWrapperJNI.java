/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.melissadata;

public class mdProfilerJavaWrapperJNI {
static{
  try{ System.loadLibrary("mdProfilerJavaWrapper");}
  catch(UnsatisfiedLinkError ule){
    System.out.println(ule);
    System.out.println("java.library.path = " + System.getProperty("java.library.path"));}}
  public final static native int mdProfiler_ErrorNone_get();
  public final static native int mdProfiler_Append_get();
  public final static native int mdProfiler_ColumnTypeInt1_get();
  public final static native int mdProfiler_ColumnTypeInt2_get();
  public final static native int mdProfiler_ColumnTypeInt4_get();
  public final static native int mdProfiler_ColumnTypeInt8_get();
  public final static native int mdProfiler_ColumnTypeUInt1_get();
  public final static native int mdProfiler_ColumnTypeUInt2_get();
  public final static native int mdProfiler_ColumnTypeUInt4_get();
  public final static native int mdProfiler_ColumnTypeUInt8_get();
  public final static native int mdProfiler_ColumnTypeReal4_get();
  public final static native int mdProfiler_ColumnTypeReal8_get();
  public final static native int mdProfiler_ColumnTypeNumeric_get();
  public final static native int mdProfiler_ColumnTypeDecimal_get();
  public final static native int mdProfiler_ColumnTypeCurrency_get();
  public final static native int mdProfiler_ColumnTypeFixedMBCSString_get();
  public final static native int mdProfiler_ColumnTypeVariableMBCSString_get();
  public final static native int mdProfiler_ColumnTypeFixedUnicodeString_get();
  public final static native int mdProfiler_ColumnTypeVariableUnicodeString_get();
  public final static native int mdProfiler_ColumnTypeDate_get();
  public final static native int mdProfiler_ColumnTypeDBDate_get();
  public final static native int mdProfiler_ColumnTypeDBTime_get();
  public final static native int mdProfiler_ColumnTypeDBTime2_get();
  public final static native int mdProfiler_ColumnTypeDBTimeStamp_get();
  public final static native int mdProfiler_ColumnTypeDBTimeStamp2_get();
  public final static native int mdProfiler_ColumnTypeDBTimeStampOffset_get();
  public final static native int mdProfiler_ColumnTypeFileTime_get();
  public final static native int mdProfiler_ColumnTypeBoolean_get();
  public final static native int mdProfiler_ColumnTypeGUID_get();
  public final static native int mdProfiler_ColumnTypeBytes_get();
  public final static native int mdProfiler_ColumnTypeImage_get();
  public final static native int mdProfiler_DataTypeFullName_get();
  public final static native int mdProfiler_DataTypeInverseName_get();
  public final static native int mdProfiler_DataTypeNamePrefix_get();
  public final static native int mdProfiler_DataTypeFirstName_get();
  public final static native int mdProfiler_DataTypeMiddleName_get();
  public final static native int mdProfiler_DataTypeLastName_get();
  public final static native int mdProfiler_DataTypeNameSuffix_get();
  public final static native int mdProfiler_DataTypeTitle_get();
  public final static native int mdProfiler_DataTypeCompany_get();
  public final static native int mdProfiler_DataTypeAddress_get();
  public final static native int mdProfiler_DataTypeCity_get();
  public final static native int mdProfiler_DataTypeStateOrProvince_get();
  public final static native int mdProfiler_DataTypeZipOrPostalCode_get();
  public final static native int mdProfiler_DataTypeCityStateZip_get();
  public final static native int mdProfiler_DataTypeCountry_get();
  public final static native int mdProfiler_DataTypePhone_get();
  public final static native int mdProfiler_DataTypeEmail_get();
  public final static native int mdProfiler_DataTypeString_get();
  public final static native int mdProfiler_DataTypeNumeric_get();
  public final static native int mdProfiler_DataTypeDateMDY_get();
  public final static native int mdProfiler_DataTypeDateYMD_get();
  public final static native int mdProfiler_DataTypeDateDMY_get();
  public final static native int mdProfiler_DataTypeBoolean_get();
  public final static native int mdProfiler_SortUnknown_get();
  public final static native int mdProfiler_SortStringAscending_get();
  public final static native int mdProfiler_SortStringDescending_get();
  public final static native int mdProfiler_SortNumericAscending_get();
  public final static native int mdProfiler_SortNumericDescending_get();
  public final static native int mdProfiler_SortDateAscending_get();
  public final static native int mdProfiler_SortDateDescending_get();
  public final static native int mdProfiler_OrderNone_get();
  public final static native int mdProfiler_OrderValueAscending_get();
  public final static native int mdProfiler_OrderValueDescending_get();
  public final static native int mdProfiler_OrderCountAscending_get();
  public final static native int mdProfiler_OrderCountDescending_get();
  public final static native int mdProfiler_DateSpanDate_get();
  public final static native int mdProfiler_DateSpanTime_get();
  public final static native int mdProfiler_DateSpanHour_get();
  public final static native int mdProfiler_DateSpanMinute_get();
  public final static native int mdProfiler_DateSpanSecond_get();
  public final static native int mdProfiler_DateSpanMillisecond_get();
  public final static native int mdProfiler_DateSpanDayOfWeek_get();
  public final static native int mdProfiler_DateSpanDay_get();
  public final static native int mdProfiler_DateSpanWeek_get();
  public final static native int mdProfiler_DateSpanMonth_get();
  public final static native int mdProfiler_DateSpanQuarter_get();
  public final static native int mdProfiler_DateSpanYear_get();
  public final static native int mdProfiler_DateSpanDecade_get();
  public final static native int mdProfiler_DateSpanCentury_get();
  public final static native long new_mdProfiler();
  public final static native void delete_mdProfiler(long jarg1);
  public final static native int mdProfiler_SetLicenseString(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native void mdProfiler_SetPathToProfilerDataFiles(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native void mdProfiler_SetFileName(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native void mdProfiler_SetAppendMode(long jarg1, mdProfiler jarg1_, int jarg2);
  public final static native void mdProfiler_SetUserName(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetUserName(long jarg1, mdProfiler jarg1_);
  public final static native void mdProfiler_SetTableName(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetTableName(long jarg1, mdProfiler jarg1_);
  public final static native void mdProfiler_SetJobName(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetJobName(long jarg1, mdProfiler jarg1_);
  public final static native void mdProfiler_SetJobDescription(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetJobDescription(long jarg1, mdProfiler jarg1_);
  public final static native void mdProfiler_SetSortAnalysis(long jarg1, mdProfiler jarg1_, int jarg2);
  public final static native void mdProfiler_SetMatchUpAnalysis(long jarg1, mdProfiler jarg1_, int jarg2);
  public final static native void mdProfiler_SetRightFielderAnalysis(long jarg1, mdProfiler jarg1_, int jarg2);
  public final static native void mdProfiler_SetDataAggregation(long jarg1, mdProfiler jarg1_, int jarg2);
  public final static native int mdProfiler_InitializeDataFiles(long jarg1, mdProfiler jarg1_);
  public final static native String mdProfiler_GetInitializeErrorString(long jarg1, mdProfiler jarg1_);
  public final static native String mdProfiler_GetBuildNumber(long jarg1, mdProfiler jarg1_);
  public final static native String mdProfiler_GetDatabaseDate(long jarg1, mdProfiler jarg1_);
  public final static native String mdProfiler_GetLicenseExpirationDate(long jarg1, mdProfiler jarg1_);
  public final static native String mdProfiler_GetProfileStartDateTime(long jarg1, mdProfiler jarg1_);
  public final static native String mdProfiler_GetProfileEndDateTime(long jarg1, mdProfiler jarg1_);
  public final static native String mdProfiler_GetColumnTypeEnum(long jarg1, mdProfiler jarg1_);
  public final static native String mdProfiler_GetColumnTypeDescription(long jarg1, mdProfiler jarg1_, int jarg2);
  public final static native int mdProfiler_ParseColumnTypeDescription(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetDataTypeEnum(long jarg1, mdProfiler jarg1_);
  public final static native String mdProfiler_GetDataTypeDescription(long jarg1, mdProfiler jarg1_, int jarg2);
  public final static native int mdProfiler_ParseDataTypeDescription(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetResultCodeEnum(long jarg1, mdProfiler jarg1_);
  public final static native String mdProfiler_GetResultCodeDescription(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native void mdProfiler_AddColumn(long jarg1, mdProfiler jarg1_, String jarg2, int jarg3, int jarg4);
  public final static native int mdProfiler_SetColumnCustomPattern(long jarg1, mdProfiler jarg1_, String jarg2, String jarg3);
  public final static native int mdProfiler_SetColumnValueRange(long jarg1, mdProfiler jarg1_, String jarg2, String jarg3, String jarg4);
  public final static native int mdProfiler_SetColumnDefaultValue(long jarg1, mdProfiler jarg1_, String jarg2, String jarg3);
  public final static native void mdProfiler_SetColumnSize(long jarg1, mdProfiler jarg1_, String jarg2, int jarg3);
  public final static native void mdProfiler_SetColumnPrecision(long jarg1, mdProfiler jarg1_, String jarg2, int jarg3);
  public final static native void mdProfiler_SetColumnScale(long jarg1, mdProfiler jarg1_, String jarg2, int jarg3);
  public final static native void mdProfiler_SetColumnIgnoreOnError(long jarg1, mdProfiler jarg1_, String jarg2, int jarg3);
  public final static native void mdProfiler_StartProfiling(long jarg1, mdProfiler jarg1_);
  public final static native void mdProfiler_SetColumn(long jarg1, mdProfiler jarg1_, String jarg2, String jarg3);
  public final static native void mdProfiler_SetColumnNull(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native void mdProfiler_AddRecord(long jarg1, mdProfiler jarg1_);
  public final static native String mdProfiler_GetResults(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native void mdProfiler_SetTextQualifier(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native void mdProfiler_SetColumnDelimiter(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native void mdProfiler_SetRowDelimiter(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_AddDelimitedRecord(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native void mdProfiler_ProfileData(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableRecordCount(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableRecordEmptyCount(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableRecordNullCount(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableEmbeddedRowDelimiterCount(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableNotAllFieldsPresentCount(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableExtraFieldsPresentCount(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableUnbalancedTextQualifiersCount(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableUnescapedEmbeddedTextQualifiersCount(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableExactMatchDistinctCount(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableExactMatchDupesCount(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableExactMatchLargestGroup(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableContactMatchDistinctCount(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableContactMatchDupesCount(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableContactMatchLargestGroup(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableHouseholdMatchDistinctCount(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableHouseholdMatchDupesCount(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableHouseholdMatchLargestGroup(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableAddressMatchDistinctCount(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableAddressMatchDupesCount(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetTableAddressMatchLargestGroup(long jarg1, mdProfiler jarg1_);
  public final static native int mdProfiler_GetColumnCount(long jarg1, mdProfiler jarg1_);
  public final static native String mdProfiler_GetColumnName(long jarg1, mdProfiler jarg1_, int jarg2);
  public final static native int mdProfiler_GetColumnColumnType(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnDataType(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnSize(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnPrecision(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnScale(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnValueRangeFrom(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnValueRangeTo(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnDefaultValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnCustomPatterns(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnInferredDataType(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnInferredColumnType(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnSortation(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native double mdProfiler_GetColumnSortationPercent(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnMostPopularCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnDistinctCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnUniqueCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnDefaultValueCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnBelowRangeCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnAboveRangeCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnAboveSizeCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnAbovePrecisionCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnAboveScaleCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnInvalidRegExCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnEmptyCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnNullCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnInvalidDataCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnInvalidUTF8Count(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnNonPrintingCharCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnDiacriticCharCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnForeignCharCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnAlphaOnlyCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnNumericOnlyCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnAlphaNumericCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnUpperCaseOnlyCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnLowerCaseOnlyCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnMixedCaseCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnSingleSpaceCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnMultiSpaceCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnLeadingSpaceCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnTrailingSpaceCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnMaxSpaces(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnMinSpaces(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnTotalSpaces(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnTotalWordBreaks(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native double mdProfiler_GetColumnAvgSpaces(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnDecorationCharCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnProfanityCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnInconsistentDataCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnStringMaxValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnStringMinValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnStringQ1Value(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnStringMedValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnStringQ3Value(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnStringMaxLength(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnStringMinLength(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native double mdProfiler_GetColumnStringAvgLength(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnStringQ1Length(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnStringMedLength(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnStringQ3Length(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnWordMaxValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnWordMinValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnWordQ1Value(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnWordMedValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnWordQ3Value(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnWordMaxLength(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnWordMinLength(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native double mdProfiler_GetColumnWordAvgLength(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnWordQ1Length(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnWordMedLength(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnWordQ3Length(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnMaxWords(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnMinWords(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native double mdProfiler_GetColumnAvgWords(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native double mdProfiler_GetColumnNumericMaxValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native double mdProfiler_GetColumnNumericMinValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native double mdProfiler_GetColumnNumericAvgValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native double mdProfiler_GetColumnNumericQ1Value(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native double mdProfiler_GetColumnNumericQ1IntValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native double mdProfiler_GetColumnNumericMedValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native double mdProfiler_GetColumnNumericMedIntValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native double mdProfiler_GetColumnNumericQ3Value(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native double mdProfiler_GetColumnNumericQ3IntValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native double mdProfiler_GetColumnNumericStdDevValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnDateMaxValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnDateMinValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnDateAvgValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnDateQ1Value(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnDateMedValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnDateQ3Value(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnTimeMaxValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnTimeMinValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnTimeAvgValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnTimeQ1Value(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnTimeMedValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetColumnTimeQ3Value(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnDateNoCenturyCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnNameInconsistentOrderCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnNameMultipleNameCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnNameSuspiciousNameCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnStateCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnProvinceCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnStateProvinceNonStandardCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnStateProvinceInvalidCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnZipCodeCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnPlus4Count(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnZipCodeInvalidCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnPostalCodeCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnPostalCodeInvalidCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnZipCodePostalCodeInvalidCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnStateZipCodeMismatchCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnProvincePostalCodeMismatchCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnCountryNonStandardCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnCountryInvalidCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnEmailSyntaxCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnEmailMobileDomainCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnEmailMisspelledDomainCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnEmailSpamtrapDomainCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnEmailDisposableDomainCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetColumnPhoneInvalidCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_StartDataFrequency(long jarg1, mdProfiler jarg1_, String jarg2, int jarg3);
  public final static native String mdProfiler_GetDataFrequencyValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetDataFrequencyCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetNextDataFrequency(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_StartLengthFrequency(long jarg1, mdProfiler jarg1_, String jarg2, int jarg3);
  public final static native int mdProfiler_GetLengthFrequencyValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetLengthFrequencyCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetNextLengthFrequency(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_StartPatternFrequency(long jarg1, mdProfiler jarg1_, String jarg2, int jarg3);
  public final static native String mdProfiler_GetPatternFrequencyValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetPatternFrequencyRegEx(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetPatternFrequencyExample(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetPatternFrequencyCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetNextPatternFrequency(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_StartDateFrequency(long jarg1, mdProfiler jarg1_, String jarg2, int jarg3, int jarg4);
  public final static native String mdProfiler_GetDateFrequencyValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetDateFrequencyCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetNextDateFrequency(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_StartSoundExFrequency(long jarg1, mdProfiler jarg1_, String jarg2, int jarg3);
  public final static native String mdProfiler_GetSoundExFrequencyValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native String mdProfiler_GetSoundExFrequencyExample(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetSoundExFrequencyCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetNextSoundExFrequency(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_StartWordFrequency(long jarg1, mdProfiler jarg1_, String jarg2, int jarg3);
  public final static native String mdProfiler_GetWordFrequencyValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetWordFrequencyCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetNextWordFrequency(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_StartWordLengthFrequency(long jarg1, mdProfiler jarg1_, String jarg2, int jarg3);
  public final static native int mdProfiler_GetWordLengthFrequencyValue(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetWordLengthFrequencyCount(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native int mdProfiler_GetNextWordLengthFrequency(long jarg1, mdProfiler jarg1_, String jarg2);
  public final static native void mdProfiler_SetReserved(long jarg1, mdProfiler jarg1_, String jarg2, String jarg3);
  public final static native String mdProfiler_GetReserved(long jarg1, mdProfiler jarg1_, String jarg2);
}