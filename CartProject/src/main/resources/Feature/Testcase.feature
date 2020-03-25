Feature: OpenCart application
@TC01_AddtoCart
Scenario:
Choose the product and add to cart
Given the url opens in Chrome application
When the user clicks on phones 
Then the user selects the product
And clicks on add to cart

@TC02_Checkcart
Scenario:
check the cart
Given url opens in chrome browser
When the user clicks on Cart option
Then the user checks the product
And confirms the product we added is present or not

@TC03_priceupdate
Scenario:
when increasing the quantity whether the price is updating or not
Given the url open in chrome browser
When user click on cart option
Then increase the quantity of the product
And click on refresh button


@TC04_storingProductDetails
Scenario:
The product details are stored in excel
Given url open in chrome browser
When the user clicks on cart option
Then clicks on the selected product
And store the product name into excel

@TC5_RemovefromCart
Scenario:
Remove the product from cart
Given the url opens in the chrome browser
And clicks on remove