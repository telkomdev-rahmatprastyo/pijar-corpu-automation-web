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

'User click "Course" on side menu'
WebUI.click(findTestObject('Learner/Side Menu/Courses'))

'Click Button "Propose New Course" untuk menampilkan form propose new course'
WebUI.click(findTestObject('Learner/Propose New Course/button_Propose New Course'))

'Click Image "Course Image" untuk upload Image'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/img__new-course-image-upload'), 
    FailureHandling.STOP_ON_FAILURE)

'Input Course Name : \'Test Couser Offline 1\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/input__courseName'), 'Test Course Online 1')

'Click "Select Category" untuk memilih category course'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Category Course/div_Select Category'))

'Click "Data Dan Analisis" untuk pilihan category course yang berhubungan dengan Data dan Analisis'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Category Course/div_Data dan Analisis'))

'Input Tanggal Mulai Course : \'01/12/2020\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Time/input_Start Date_dateFrom'), 
    '01/12/2020')

'Input Tanggal Selesai Course : \'15/12/2020\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Time/input_End Date_dateTo'), 
    '02/01/2021')

'Click "Selected Estimated Time" untuk menentukan perkiraan waktu course dalam Jam, Hari , atau Bulan'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Time/div_Select Estimated Time'))

'Click "Months" jika perkiraan waktu course untuk beberapa bulan'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Time/div_Months'))

'Input Value Estimated Time : \'1\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Time/input_estimatedTimeValue'), 
    '1')

'Click "Select Price Type" untuk menentukan course tersebut berbayar atau gratis'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Price/div_Select Price Type'))

'Click "Free" jika course gratis'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Price/div_Free'))

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

'Click "Intermediate" jika level course untuk intermediate'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Level/div_Intermediate'))

'Input Description : \'descripsi online course internal instructor\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/textarea__description'), 
    'descripsi online course internal instructor')

'Input Curriculum : \'test\''
WebUI.setText(findTestObject('Learner/Propose New Course/Form Request New Propose Course/textarea_Curriculum_curriculum'), 
    'test')

'Click "Select Skill Sets" untuk memilih skill course dan bisa lebih dari satu skill'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Skill Sets/div_Select Skill Sets'))

'Click "A/B Testing" jika A/B Testing merupakan skill pada course tersebut'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Skill Sets/div_AB Testing'))

'Click "Instructor" untuk memilih istructor internal atau eksternal'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Internal Instructor/div_Internal'))

'Click "Internal" jika instructor dari internal'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Internal Instructor/div_Internal_1'))

'Click "Instructor Input" untuk memilih instructor course dari internal '
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Internal Instructor/div_Instructor_css-1mrh6l4-control'))

'Click "Fauzan Faisal" jika instructor yang dipilih adalah Fauzan Faisal'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/Internal Instructor/div_FAUZAN FEISAL'))

'Click "Submit" menyimpan new course dan mengirimkan notify new course ke corpu'
WebUI.click(findTestObject('Learner/Propose New Course/Form Request New Propose Course/button_Submit'))

WebUI.delay(5)

