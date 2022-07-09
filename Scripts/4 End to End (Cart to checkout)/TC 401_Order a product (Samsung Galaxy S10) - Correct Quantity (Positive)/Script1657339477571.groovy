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
import com.price.PriceCalculator as PriceCalculator
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\btdp\\bootcamp\\katalon\\mobile-ecommerce-testing\\APK\\ECommerce -SAMPLE-Android.apk', false)

Mobile.verifyElementText(findTestObject('Recent Page/text_1st Product Name'), 'Samsung Galaxy S10 - Black')

Mobile.tap(findTestObject('Recent Page/ImageView_Product Samsung Galaxy S10 - Black'), 0)

Mobile.verifyElementExist(findTestObject('Product Page/text_Product Name'), 20)

GlobalVariable.productName = Mobile.getText(findTestObject('Product Page/text_Product Name'), 10)

Mobile.verifyElementText(findTestObject('Product Page/text_Product Name'), GlobalVariable.productName)

GlobalVariable.productStock = Mobile.getText(findTestObject('Product Page/text_Product Stock'), 3, FailureHandling.STOP_ON_FAILURE)

String price = Mobile.getText(findTestObject('Product Page/text_Product Price'), 3)

GlobalVariable.productPrice = price.substring(0, price.length() - 4)

println(GlobalVariable.productPrice)

Mobile.tap(findTestObject('Product Page/button_ADD TO CART'), 0)

Mobile.verifyElementExist(findTestObject('Product Page/Number of Order/popup_Number of Order'), 0)

Mobile.setText(findTestObject('Product Page/Number of Order/input_text_Order Quantity'), '5', 3)

Mobile.tap(findTestObject('Product Page/Number of Order/button_ADD'), 0)

Mobile.tap(findTestObject('Product Page/button_Shopping Cart'), 0)

Mobile.verifyElementText(findTestObject('Shopping Cart/TextView_Shopping Cart_Samsung Galaxy S10 - Black'), GlobalVariable.productName)

Mobile.verifyElementText(findTestObject('Shopping Cart/text_Price x Qty'), '899 USD x 5')

Mobile.verifyElementText(findTestObject('Shopping Cart/text_Total Price'), 'Total : 4.495 USD', FailureHandling.OPTIONAL)

Mobile.verifyElementText(findTestObject('Shopping Cart/text_Product Price'), '4.495 USD')

Mobile.verifyElementText(findTestObject('Shopping Cart/text_Tax'), 'Tax : 10 %')

Mobile.tap(findTestObject('Shopping Cart/button_CHECKOUT'), 0)

Mobile.tap(findTestObject('Checkout Page/android.widget.Button - PROCESS CHECKOUT'), 5)

Mobile.tap(findTestObject('Checkout Page/android.widget.Button - YES'), 0)

Mobile.verifyElementExist(findTestObject('Checkout Page/android.widget.TextView - Congratulation'), 15)

Mobile.tap(findTestObject('Checkout Page/android.widget.Button - OK'), 0)

