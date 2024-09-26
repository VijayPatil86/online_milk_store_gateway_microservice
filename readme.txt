This service is gateway service meaning it is the only entry point to access the other micro services.
That means, external applications wishing to access the micro service must call this gateway service, then, based on request path,
gateway service forwards the request to the intended service.
Here is the gateway uri to access the product-service:
	http://localhost:9003/oms/categories
	where,
		9003 - gateway micro service server port
		oms - system name
		categories - rest api of intended service

	spring.cloud.gateway.routes[0].id=product-service
	spring.cloud.gateway.routes[0].uri=http://localhost:9001
	spring.cloud.gateway.routes[0].predicates[0]=Path=/oms/**
	spring.cloud.gateway.routes[0].filters[0]=StripPrefix=1
	here,
		Path=/oms/** -
			represents the gateway uri, /oms/categories
		StripPrefix=1 -
			removes 1st part from request path, /oms/categories, resulting in /categories
		uri -
			uri of product-service
	the result of these configurations is, http://localhost:9001/categories, which is the actual product-service uri.
