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
import org.openqa.selenium.Keys as Keys

'Login Sebagai User Employee Learner'
WebUI.callTestCase(findTestCase('Login/Positive Cases/TC001-Make Sure User Employee Learner Can Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Click "Course" untuk menampilkan list course'
WebUI.click(findTestObject('Learner/Side Menu/Courses'))

'Click Button "Propose New Course" untuk menampilkan form propose new course'
WebUI.click(findTestObject('Learner/Propose New Course/Form Propose New Course/button_Propose New Course'))

'Click Image "Course Image" untuk upload Image'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/img__new-course-image-upload'), 
    FailureHandling.STOP_ON_FAILURE)

'Input Course Name : \'Test Couser Offline\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/input__courseName'), 'Test Course Online 2')

'Click "Select Category" untuk memilih category course'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Category Course/div_Select Category'))

'Click "Data Dan Analisis" untuk pilihan category course yang berhubungan dengan Data dan Analisis'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Category Course/div_Data dan Analisis'))

'Click "Selected Estimated Time" untuk menentukan perkiraan waktu course dalam Jam, Hari , atau Bulan'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Time/div_Select Estimated Time'))

'Click "Days" jika perkiraan waktu course hanya beberapa hari'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Time/div_Days'))

'Input Value Estimated Time : \'14\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Time/input_estimatedTimeValue'), 
    '14')

'Click "Select Price Type" untuk menentukan course tersebut berbayar atau gratis'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Price/div_Select Price Type'))

'Click "Paid" jika course berbayar'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Price/div_Paid'))

'Input Payment Course : \'200000\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Price/input_Paid_paymentValue'), 
    '200000')

'Click / Checklist "Online" jika course online'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Course Type/Online/label_Online'))

'Input link course : \'www.udemy.com\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Course Type/Online/input__linkCourse'), 
    'www.udemy.com')

'Click "Select Provider" untuk melilih provider course'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Provider/div_Select Provider'))

'Click "Udemy" jika provider course yang di pilih adalah udemy'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Provider/div_Udemy'))

'Click "Select Level" untuk memilih level course'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Level/div_Select Level'))

'Click "Not Categorized" jika level course tidak ada'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Level/div_Not Categorized'))

'Input Description : \'descripsi online course internal instructor\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/textarea__description'), 
    'descripsi online course internal instructor')

'Click "Select Skill Sets" untuk memilih skill course dan bisa lebih dari satu skill'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Skill Sets/div_Select Skill Sets'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Skill Sets/div_Software Quality Assurance'), 
    FailureHandling.STOP_ON_FAILURE)

'Click "Instructor" untuk memilih istructor internal atau eksternal'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Eksternal Instructor/div_Internal'))

'Click "Instructor Input" untuk memilih instructor course dari internal '
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Eksternal Instructor/div_External'))

'Input Name Instructor : \'Afif\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Eksternal Instructor/input__name'), 
    'Afif')

'Input Position Instructor : \'dev\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Eksternal Instructor/input__position'), 
    'dev')

'Click "Upload File" jika ingin mengupload image instructor'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Eksternal Instructor/div_Upload File'), 
    FailureHandling.STOP_ON_FAILURE)

