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

Mobile.startApplication('C:\\Users\\Maulana Y\\Downloads\\Advantage+demo+3.2.apk', true)

Mobile.tap(findTestObject('Object Repository/Register/MenuBar'), 0)

Mobile.tap(findTestObject('Object Repository/Register/LOGIN'), 0)

Mobile.setText(findTestObject('Login/input Username login'), 'namuu', 0)

Mobile.setText(findTestObject('Login/Input Password Login'), 'Halo1', 0)

Mobile.tap(findTestObject('Login/android.widget.Button - LOGIN'), 0)

Mobile.tap(findTestObject('Object Repository/Order to Payment/HEADPHONES'), 0)

Mobile.tap(findTestObject('Object Repository/Order to Payment/BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES'), 0)

Mobile.tap(findTestObject('Object Repository/Order to Payment/Button - ADD TO CART'), 0)

Mobile.tap(findTestObject('Object Repository/Order to Payment/Cart'), 0)

Mobile.tap(findTestObject('Object Repository/Order to Payment/Button - CHECKOUT (PAY 179.99)'), 0)

Mobile.tap(findTestObject('Object Repository/Order to Payment/PaymentSelect'), 0)

Mobile.tap(findTestObject('Object Repository/Order to Payment/SafePay'), 0)

Mobile.setText(findTestObject('Object Repository/Order to Payment/SfUname'), 'halohalo', 0)

Mobile.setText(findTestObject('Object Repository/Order to Payment/SfPassw'), 'Halo1', 5)

Mobile.tap(findTestObject('Order to Payment/android.widget.TextView - APPLY'), 0)

Mobile.tap(findTestObject('Object Repository/Order to Payment/android.widget.Button - PAY NOW'), 0)

Mobile.verifyElementVisible(findTestObject('Order to Payment/android.widget.TextView - Your cart was successfully purchased'), 
    0)

Mobile.tap(findTestObject('Object Repository/Order to Payment/Close'), 0)

