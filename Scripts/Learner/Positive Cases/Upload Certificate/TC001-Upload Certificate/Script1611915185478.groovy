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

'Login as User Employee Learner'
WebUI.callTestCase(findTestCase('Login/Positive Cases/TC001-Make Sure User Employee Learner Can Login'), [:], FailureHandling.STOP_ON_FAILURE)

'User view a text element to verify the username "Admintest Learner"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_username'), 'Admintest Learner')

'User employee view a text element to verify the nik "0002"'
WebUI.verifyElementText(findTestObject('Learner/Dashboard/b_nik'), '0002')

'User employee click "Profile" on the side menu'
WebUI.click(findTestObject('Learner/Side Menu/Profile'))

'User employee click "My Course" to see a list of courses that are On Going, Pending, Rejected, or Finished'
WebUI.click(findTestObject('Learner/Menu Profile/My Course'))

'User click "Course" : 3D Programming with JavaScript and the Three.js 3D Library'
WebUI.click(findTestObject('Learner/Upload Certificate/Page_Learn Aja/div_3D Programming with JavaScript and the Threejs 3D Library'))

'Click Button "Upload Certificate" dan menampilkan form untuk upload sertifikat'
WebUI.click(findTestObject('Learner/Upload Certificate/button_Upload Certificate'))

'Click "Category" untuk memilih sertifikat yang di upload termasuk category completion , scoring , atau other'
WebUI.click(findTestObject('Learner/Upload Certificate/div_Category'))

'Click "Completion" jika sertifikat yang di upload termasuk category completion'
WebUI.click(findTestObject('Learner/Upload Certificate/div_Completion'))

'Click "Choose Certificate File" untuk memilih dan mengupload sertifikat '
WebUI.click(findTestObject('Learner/Upload Certificate/div_Choose Certificate FilePDF only with ma_42c0ab'))

'View text \'*PDF only with maximum size 500kb\''
WebUI.verifyElementText(findTestObject('Learner/Upload Certificate/span_PDF only with maximum size 500kb'), 
    '*PDF only with maximum size 500kb')

WebUI.delay(10)

'Click Button "Add" jika sertifikat yang akan di upload lebih dari satu sertifikat'
WebUI.click(findTestObject('Learner/Upload Certificate/button_Add'))

'Click image "Trash box" jika form sertifikat yang ingin di upload berlebihan'
WebUI.click(findTestObject('Learner/Upload Certificate/span_PDF only with maximum size 500kb_btn-t_a78c33'))

