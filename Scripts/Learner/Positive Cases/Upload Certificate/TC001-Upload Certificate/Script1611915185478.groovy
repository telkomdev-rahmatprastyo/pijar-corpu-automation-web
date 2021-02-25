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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('CustomKeyword In TestCase/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CustomKeyword In TestCase/Login User Employee as Learner'), [:], FailureHandling.STOP_ON_FAILURE)

'User employee view a text element to verify the nik "0002"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_nik'), '0002')

'User view a text element to verify the username "Admintest Learner"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_username'), 'Admintest Learner')

'User employee click "Profile" on the side menu'
WebUI.click(findTestObject('Learner/Side Menu/Profile'))

'User employee click "My Course" to see a list of courses that are On Going, Pending, Rejected, or Finished'
WebUI.click(findTestObject('Learner/Menu Profile/My Course'))

WebUI.click(findTestObject('Learner/Upload Certificate/label_Load More'))

'User click "Course" '
WebUI.click(findTestObject('Learner/Upload Certificate/Course/div_2020 Python Regular Expressions (Regex) with Projects'))

'Click Button "Upload Certificate" dan menampilkan form untuk upload sertifikat'
WebUI.click(findTestObject('Learner/Upload Certificate/button_Upload Certificate'))

'Click "Category" untuk memilih sertifikat yang di upload termasuk category completion , scoring , atau other'
WebUI.click(findTestObject('Learner/Upload Certificate/Category/div_Category'))

'Click "Completion" jika sertifikat yang di upload termasuk category completion'
WebUI.click(findTestObject('Learner/Upload Certificate/Category/div_Completion'))

WebUI.uploadFile(findTestObject('Learner/Upload Certificate/input_Category_uploadCertificateFile0'), fileUpload)

'View text \'*PDF only with maximum size 500kb\''
WebUI.verifyElementText(findTestObject('Learner/Upload Certificate/span_PDF only with maximum size 500kb'), '*PDF only with maximum size 500kb')

'Click Button "Add" jika sertifikat yang akan di upload lebih dari satu sertifikat'
WebUI.click(findTestObject('Learner/Upload Certificate/button_Add'))

'Click image "Trash box" jika form sertifikat yang ingin di upload berlebihan'
WebUI.click(findTestObject('Learner/Upload Certificate/span_PDF only with maximum size 500kb_btn-t_a78c33'))

