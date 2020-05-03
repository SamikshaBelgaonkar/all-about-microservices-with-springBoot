CURRENCY-EXCHANGE-SERVICE
--------------------------------------------------------------------------------------------------------------
-It has an endpoint http:localhost:8000/currency-exchange/CurrencyFrom/{from}/toCurrency/{to} which takes two arguments and returns the conversionFactor for the currency that is to be donated.
-added one field as the port so as to get to know from which server our service is bringing response. To get to know more use of this, add another instance of service through VM arguments using "-Dserver.port=8001"
-registered this service on eureka as well as zuul.
