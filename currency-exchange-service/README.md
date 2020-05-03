CURRENCY-EXCHANGE-SERVICE
--------------------------------------------------------------------------------------------------------------
-It has an endpoint http:localhost:8000/currency-exchange/CurrencyFrom/{from}/toCurrency/{to} which takes two arguments and returns the conversionFactor for the currency that is to be donated.

-added one field as the port so as to get to know from which server our service is bringing response. To get to know more use of this, add another instance of service through VM arguments using "-Dserver.port=8001".

-registered this service on eureka as well as zuul.

PLEASE NOTE: In order to execute Eureka naming server, Zuul gateway, Ribbon, make sure all the services are UP and the ports are running successfully.
--------------------------------------------------------------------------------------------------------------------------------------
