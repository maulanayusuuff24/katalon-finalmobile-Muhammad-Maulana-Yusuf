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

Mobile.tap(findTestObject('Object Repository/Register/SIGN UP TODAY'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView - USER NAME'), 0)

Mobile.setText(findTestObject('Object Repository/Register/EditTextUsername'), username, 0)

Mobile.setText(findTestObject('Object Repository/Register/EditTextEmail'), email, 0)

Mobile.setText(findTestObject('Object Repository/Register/EditTextPassword'), password, 0)

Mobile.setText(findTestObject('Object Repository/Register/EditTextConfirmPassword'), cpassword, 0)

Mobile.hideKeyboard()

Mobile.scrollToText('Country')

Mobile.setText(findTestObject('Register/FirstName'), firstname, 0)

Mobile.setText(findTestObject('Register/LastName'), lastname, 0)

Mobile.setText(findTestObject('Register/PhoneNumber'), phone, 0)

Mobile.setText(findTestObject('Register/State'), state, 0)

Mobile.setText(findTestObject('Register/Address'), address, 0)

Mobile.setText(findTestObject('Register/City'), city, 0)

Mobile.setText(findTestObject('Register/Zip'), postcode, 0)

Mobile.hideKeyboard()

if (offer == '1') {
    Mobile.tap(findTestObject('Register/android.widget.CheckBox - Receive exclusive offers and promotions'), 0)
} else {
    Mobile.tap(findTestObject('Register/android.widget.CheckBox - Receive exclusive offers and promotions'), 0)

    Mobile.tap(findTestObject('Register/android.widget.CheckBox - Receive exclusive offers and promotions'), 0)
}

Mobile.tap(findTestObject('Register/Button - REGISTER'), 0)

