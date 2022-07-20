import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('APK/ECommerce -SAMPLE-Android.apk', true)

Mobile.tap(findTestObject('Profile Page/button_Profile'), 5)

Mobile.verifyElementVisible(findTestObject('Profile Page/frame_Your Profile Details'), 20)

Mobile.tap(findTestObject('Profile Page/button_EDIT'), 15)

Mobile.verifyElementVisible(findTestObject('Profile Page/User Profile/layout_Name'), 20)

Mobile.tap(findTestObject('Profile Page/User Profile/layout_Name'), 0)

Mobile.verifyElementVisible(findTestObject('Profile Page/User Profile/text_form_Name'), 0)

Mobile.setText(findTestObject('Profile Page/User Profile/inputText_Your name'), GlobalVariable.profileName, 0)

Mobile.tap(findTestObject('Profile Page/User Profile/button_OK'), 0)

Mobile.verifyElementText(findTestObject('Profile Page/User Profile/text_Profile Name'), GlobalVariable.profileName)

Mobile.tap(findTestObject('Profile Page/User Profile/layout_Email'), 0)

Mobile.verifyElementVisible(findTestObject('Profile Page/User Profile/text_formheading_Email'), 0)

Mobile.setText(findTestObject('Profile Page/User Profile/input_text_Email'), GlobalVariable.profileEmail, 0)

Mobile.tap(findTestObject('Profile Page/User Profile/button_OK'), 0)

Mobile.verifyElementText(findTestObject('Profile Page/User Profile/text_Profile Email'), GlobalVariable.profileEmail)

Mobile.tap(findTestObject('Profile Page/User Profile/layout_Address'), 0)

Mobile.verifyElementVisible(findTestObject('Profile Page/User Profile/text_formheading_Address'), 0)

Mobile.setText(findTestObject('Profile Page/User Profile/input_text_Address'), GlobalVariable.profileAddress, 0)

Mobile.tap(findTestObject('Profile Page/User Profile/button_OK'), 0)

Mobile.verifyElementText(findTestObject('Profile Page/User Profile/text_Profile Address'), GlobalVariable.profileAddress)

Mobile.tap(findTestObject('Profile Page/User Profile/layout_Phone Number'), 0)

Mobile.verifyElementVisible(findTestObject('Profile Page/User Profile/text_formheading_Phone Number'), 0)

Mobile.setText(findTestObject('Profile Page/User Profile/input_text_628123456789'), GlobalVariable.profilePhoneNumber, 0)

Mobile.tap(findTestObject('Profile Page/User Profile/button_OK'), 0)

Mobile.verifyElementText(findTestObject('Profile Page/User Profile/text_Profile Phone Number'), GlobalVariable.profilePhoneNumber)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('Profile Page/frame_Your Profile Details'), 0)

Mobile.verifyElementText(findTestObject('Profile Page/text_Your Name'), GlobalVariable.profileName)

Mobile.verifyElementText(findTestObject('Profile Page/text_your.emailgmail.com'), GlobalVariable.profileEmail)

Mobile.verifyElementText(findTestObject('Profile Page/text_Your Address'), GlobalVariable.profileAddress)

Mobile.verifyElementText(findTestObject('Profile Page/text_Phone Number'), GlobalVariable.profilePhoneNumber)

Mobile.closeApplication()

