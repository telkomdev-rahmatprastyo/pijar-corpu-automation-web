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

'Click "Approval"'
WebUI.click(findTestObject('Admin/Approve or Reject New Course/div_Approval'))

'Click "Admin"'
WebUI.click(findTestObject('Admin/Approve or Reject New Course/div_Admin'))

'Click "New Course Yang Akan Di Reject" untuk menampilkan detail new course'
WebUI.click(findTestObject('Admin/Approve or Reject New Course/List New Course/div_Propose Date November 23 2020AdmintestD_0afe57'))

'Click Button "Reject" jika new course akan di reject / di tolak'
WebUI.click(findTestObject('Admin/Approve or Reject New Course/button_Reject'))

'Click "Select Reason" untuk menampilkan beberapa alsasan yang sudah ada'
WebUI.click(findTestObject('Admin/Approve or Reject New Course/div_Select Reason'))

'Click "Data Course Not Relevant or Not Valid" untuk memilih alasan tersebut'
WebUI.click(findTestObject('Admin/Approve or Reject New Course/div_data course not relevant or not valid'))

'Input deskripsi reason : \' Data Course Not Relevant\''
WebUI.setText(findTestObject('Admin/Approve or Reject New Course/textarea_data course not relevant or not va_4ac31a'), 'Data Course Not Relevant')

'Click Button "Submit" untuk menyimpan dan mengirimkan notify ke employee learner'
WebUI.click(findTestObject('Admin/Approve or Reject New Course/a_Submit'))

'Click "Oke" berhasil menyimpan'
WebUI.click(findTestObject('Admin/Approve or Reject New Course/a_Ok'))

WebUI.delay(5)

