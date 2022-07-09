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

Mobile.startApplication('C:\\btdp\\bootcamp\\katalon\\mobile-ecommerce-testing\\APK\\ECommerce -SAMPLE-Android.apk', true)

Mobile.getText(findTestObject('Object Repository/Product Page/text_ProductName_Apple watch series 3 GPS 42mm Black'), 0)

Mobile.tap(findTestObject('Object Repository/Product Page/image_Product Image_Apple watch series 3 GPS 42mm Black'), 0)

Mobile.verifyElementExist(findTestObject('Product Page/text_Product Name'), 20)

Mobile.getText(findTestObject('Product Page/text_Product Stock'), 5)

Mobile.tap(findTestObject('Product Page/button_ADD TO CART'), 10)

Mobile.setText(findTestObject('Product Page/Number of Order/input_text_Order Quantity'), '0', 15)

Mobile.tap(findTestObject('Product Page/Number of Order/button_ADD'), 0)

Mobile.tap(findTestObject('Product Page/button_Shopping Cart'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Shopping Cart/text_Whoops, your cart is empty'), 15)

Mobile.closeApplication()

