COVID_19 - SERVICE
--------------------------------------------------------------------------------------------------------------
There are 4 endpoints:

  1) getData-WithConvertedCurrency-feign/from/{from}/to/{to}/quantity/{quantity}
  
  - this endpoint takes the amount to be donated in "quantity", the "from" and "to" indicates the currency which is to be exchanged(converted).
  - this internally calls "currency-exchange service"(localhost:8001) to get the conversionFactor of the currencies.
  - Also, used Ribbon in order to achieve loadBalancing. ( Ribbon will help in distributing requests from "Covid-currency-service" to two active instances of "currency-exchange service").
  - Make sure you make the "currency-exchange service" UP on both the ports(8001 and 8000) so as to watch LoadBalancing taking place.
  - Included Eureka NamingServer for service registry.
  
  2)/api/data
  
  - helps you get all the record of the patients across the world(positiveCases,casesUnderObservation and so on..)
  
  3) /api/data/{id}
  - admin can add the data using this simple POST endpoint.
  
  4)/api/data/{id}
  - this endpoint helps in getting a partiicular record(GET_BY_ID).
-------------------------------------------------------------------------------------------------------------------------------------
PLEASE NOTE: In order to execute Eureka naming server, Zuul gateway, Ribbon, make sure you all the services are UP and the ports are running successfully.
-------------------------------------------------------------------------------------------------------------------------------------
