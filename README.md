# Retail Shop Discount
Retail Shop Discount API - Assessment

Step 1: Import the application as a spring boot application and import all libraries 

Step 2: Go to src/test/java/com/store/retail/
    right click on ShopServiceTest class and select run ShopServiceTest

Step 3: other ways to test 

    a- Start Build Retail Application
    b- Open Postman or any other api testing tool 
    c- past the url http://localhost:8080/getNetPayableAmount in the url field
    d- set the method to POST
    e- set the request header Content-Type to application/json
    f- set the request body to the below payload:
        {
            "requestId": "Q0HDMAR345",
            "itemOrders":[
                {
                    "itemId": 1,
                    "quantity": 4
                },
                {
                    "itemId": 4,
                    "quantity": 4
                },
                {
                    "itemId": 2,
                    "quantity": 4
                }
        
            ],
            "shopUserId": 1
        }
    
    g- Response payload will contain the total amount, the discount amount and the final amount
    
    
    {
        "items": [
            {
                "id": 1,
                "name": "APPLE",
                "price": 0.5,
                "itemCategory": {
                    "id": 2,
                    "catName": "Groceries",
                    "catDescription": "All Grocery stuffs",
                    "bonus": false
                }
            },
            {
                "id": 4,
                "name": "iPhone",
                "price": 1500.0,
                "itemCategory": {
                    "id": 1,
                    "catName": "Electronics",
                    "catDescription": "All electronic stuffs",
                    "bonus": true
                }
            },
            {
                "id": 2,
                "name": "ORANGE",
                "price": 0.34,
                "itemCategory": {
                    "id": 2,
                    "catName": "Groceries",
                    "catDescription": "All Grocery stuffs",
                    "bonus": false
                }
            }
        ],
        "total": 6003.36,
        "discountAmount": 1800.0,
        "finalAmount": 4203.36,
        "requestId": "Q0HDMAR345"
    }  