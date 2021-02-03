import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData

import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

'Login Sebagai User Employee HC'
WebUI.callTestCase(findTestCase('Login/Positive Cases/TC003-Make Sure User Employee HC Can Login'), [:], FailureHandling.STOP_ON_FAILURE)

'The user employee view a text element to verify the username "Admintest Hc"'
WebUI.verifyElementText(findTestObject('HC/Dashboard/b_username'), 'Admintest Hc')

'The user employee view a text element to verify the nik "2000"'
WebUI.verifyElementText(findTestObject('HC/Dashboard/b_nik'), '2000')

'Click "Approval" pada side menu'
WebUI.click(findTestObject('HC/Side Menu/div_Approval'))

'Click "Human Capital" pada side menu'
WebUI.click(findTestObject('HC/Side Menu/div_Human Capital'))

'Click "Certificate Verification" untuk melihat list certificate course yang meminta persetujuan'
WebUI.click(findTestObject('HC/Verification Menu/div_Certificate Verification'))

'Click "Certificate yang akan di reject" untuk melihat course details dan certificate'
WebUI.click(findTestObject('null'))

'Click Button "Reject" untuk menolak certificate'
WebUI.click(findTestObject('HC/Approve or Reject Certificate/button_Reject'))

'Click "Select Reason" untuk menampilkan beberapa alsasan certificate reject yang sudah ada'
WebUI.click(findTestObject('HC/Approve or Reject Certificate/div_Select Reason'))

'Click "not related the course taken" untuk memilih alasan tersebut'
WebUI.click(findTestObject('HC/Approve or Reject Certificate/div_not related to the course taken'))

'Input deskripsi reason : \'course does not suit position\''
WebUI.setText(findTestObject('HC/Approve or Reject Certificate/textarea_rejected'), 'not related the course taken')

'Click Button "Submit" untuk menyimpan data certificate rejected dan mengirimkan notification ke user employee learner'
WebUI.click(findTestObject('HC/Approve or Reject Certificate/a_Submit'))

'Click Button "OK" '
WebUI.click(findTestObject('HC/Approve or Reject Certificate/a_Ok (1)'))

