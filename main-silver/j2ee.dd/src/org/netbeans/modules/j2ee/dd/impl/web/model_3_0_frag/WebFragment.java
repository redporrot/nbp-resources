/**
 *	This generated bean class WebFragment matches the schema element 'web-fragment'.
 *
 *	===============================================================
 *	
 *	
 *		The web-fragment element is the root of the deployment
 *		descriptor for a web fragment.  Note that the sub-elements
 *		of this element can be in the arbitrary order. Because of
 *		that, the multiplicity of the elements of distributable,
 *		session-config, welcome-file-list, jsp-config, login-config,
 *		and locale-encoding-mapping-list was changed from "?" to "*"
 *		in this schema.  However, the deployment descriptor instance
 *		file must not contain multiple elements of session-config,
 *		jsp-config, and login-config. When there are multiple elements of
 *		welcome-file-list or locale-encoding-mapping-list, the container
 *		must concatenate the element contents.  The multiple occurence
 *		of the element distributable is redundant and the container
 *		treats that case exactly in the same way when there is only
 *		one distributable.
 *	
 *	      
 *	===============================================================
 *
 *	This class matches the root element of the XML Schema,
 *	and is the root of the following bean graph:
 *
 *	webFragment <web-fragment> : WebFragment
 *		[attr: version CDATA #REQUIRED 3.0 : java.lang.String] 	[enumeration (3.0)]
 *		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		[attr: metadata-complete CDATA #IMPLIED  : boolean]
 *		(
 *		  | name <name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | description <description> : java.lang.String[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | icon <icon> : Icon[0,n]
 *		  | | 	[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	smallIcon <small-icon> : java.lang.String[0,1]
 *		  | | 	largeIcon <large-icon> : java.lang.String[0,1]
 *		  | | distributable <distributable> : EmptyType
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | contextParam <context-param> : InitParam
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	paramName <param-name> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	paramValue <param-value> : java.lang.String
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | filter <filter> : Filter
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	icon <icon> : Icon[0,n]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		smallIcon <small-icon> : java.lang.String[0,1]
 *		  | | 		largeIcon <large-icon> : java.lang.String[0,1]
 *		  | | 	filterName <filter-name> : java.lang.String 	[minLength (1)]
 *		  | | 	filterClass <filter-class> : java.lang.String[0,1]
 *		  | | 	asyncSupported <async-supported> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 	initParam <init-param> : InitParam[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		description <description> : java.lang.String[0,n]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		paramName <param-name> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		paramValue <param-value> : java.lang.String
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | filterMapping <filter-mapping> : FilterMapping
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	filterName <filter-name> : java.lang.String 	[minLength (1)]
 *		  | | 	(
 *		  | | 	  | urlPattern <url-pattern> : java.lang.String
 *		  | | 	  | servletName <servlet-name> : java.lang.String 	[minLength (1)]
 *		  | | 	)[1,n]
 *		  | | 	dispatcher <dispatcher> : java.lang.String[0,n] 	[enumeration (FORWARD), enumeration (INCLUDE), enumeration (REQUEST), enumeration (ASYNC), enumeration (ERROR), maxOccurs (5)]
 *		  | | listener <listener> : Listener
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	icon <icon> : Icon[0,n]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		smallIcon <small-icon> : java.lang.String[0,1]
 *		  | | 		largeIcon <large-icon> : java.lang.String[0,1]
 *		  | | 	listenerClass <listener-class> : java.lang.String
 *		  | | servlet <servlet> : Servlet
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	icon <icon> : Icon[0,n]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		smallIcon <small-icon> : java.lang.String[0,1]
 *		  | | 		largeIcon <large-icon> : java.lang.String[0,1]
 *		  | | 	servletName <servlet-name> : java.lang.String 	[minLength (1)]
 *		  | | 	(
 *		  | | 	  | servletClass <servlet-class> : java.lang.String
 *		  | | 	  | jspFile <jsp-file> : java.lang.String
 *		  | | 	)[0,1]
 *		  | | 	initParam <init-param> : InitParam[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		description <description> : java.lang.String[0,n]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		paramName <param-name> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		paramValue <param-value> : java.lang.String
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	loadOnStartup <load-on-startup> : java.math.BigInteger[0,1] 	[enumeration ()]
 *		  | | 	enabled <enabled> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 	asyncSupported <async-supported> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 	runAs <run-as> : RunAs[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		description <description> : java.lang.String[0,n]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		roleName <role-name> : java.lang.String
 *		  | | 	securityRoleRef <security-role-ref> : SecurityRoleRef[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		description <description> : java.lang.String[0,n]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		roleName <role-name> : java.lang.String
 *		  | | 		roleLink <role-link> : java.lang.String[0,1]
 *		  | | 	multipartConfig <multipart-config> : MultipartConfigType[0,1]
 *		  | | 		location <location> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		maxFileSize <max-file-size> : long[0,1]
 *		  | | 		maxRequestSize <max-request-size> : long[0,1]
 *		  | | 		fileSizeThreshold <file-size-threshold> : java.math.BigInteger[0,1]
 *		  | | servletMapping <servlet-mapping> : ServletMapping
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	servletName <servlet-name> : java.lang.String 	[minLength (1)]
 *		  | | 	urlPattern <url-pattern> : java.lang.String[1,n]
 *		  | | sessionConfig <session-config> : SessionConfig
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	sessionTimeout <session-timeout> : java.math.BigInteger[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	cookieConfig <cookie-config> : CookieConfigType[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		name <name> : java.lang.String[0,1] 	[minLength (1)]
 *		  | | 		domain <domain> : java.lang.String[0,1] 	[minLength (1)]
 *		  | | 		path <path> : java.lang.String[0,1] 	[minLength (1)]
 *		  | | 		comment <comment> : java.lang.String[0,1] 	[minLength (1)]
 *		  | | 		httpOnly <http-only> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		secure <secure> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		maxAge <max-age> : java.math.BigInteger[0,1]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	trackingMode <tracking-mode> : java.lang.String[0,n] 	[enumeration (COOKIE), enumeration (URL), enumeration (SSL), maxOccurs (3)]
 *		  | | mimeMapping <mime-mapping> : MimeMapping
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	extension <extension> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	mimeType <mime-type> : java.lang.String 	[pattern ([^\p{Cc}^\s]+/[^\p{Cc}^\s]+)]
 *		  | | welcomeFileList <welcome-file-list> : WelcomeFileList
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	welcomeFile <welcome-file> : java.lang.String[1,n]
 *		  | | errorPage <error-page> : ErrorPage
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	(
 *		  | | 	  | errorCode <error-code> : Integer 	[pattern (\d{3})]
 *		  | | 	  | exceptionType <exception-type> : java.lang.String
 *		  | | 	)[0,1]
 *		  | | 	location <location> : java.lang.String 	[pattern (/.*)]
 *		  | | jspConfig <jsp-config> : JspConfig
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	taglib <taglib> : Taglib[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		taglibUri <taglib-uri> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		taglibLocation <taglib-location> : java.lang.String
 *		  | | 	jspPropertyGroup <jsp-property-group> : JspPropertyGroup[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		description <description> : java.lang.String[0,n]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		icon <icon> : Icon[0,n]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			smallIcon <small-icon> : java.lang.String[0,1]
 *		  | | 			largeIcon <large-icon> : java.lang.String[0,1]
 *		  | | 		urlPattern <url-pattern> : java.lang.String[1,n]
 *		  | | 		elIgnored <el-ignored> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		pageEncoding <page-encoding> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		scriptingInvalid <scripting-invalid> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		isXml <is-xml> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		includePrelude <include-prelude> : java.lang.String[0,n]
 *		  | | 		includeCoda <include-coda> : java.lang.String[0,n]
 *		  | | 		deferredSyntaxAllowedAsLiteral <deferred-syntax-allowed-as-literal> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		trimDirectiveWhitespaces <trim-directive-whitespaces> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		defaultContentType <default-content-type> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		buffer <buffer> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		errorOnUndeclaredNamespace <error-on-undeclared-namespace> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | securityConstraint <security-constraint> : SecurityConstraint
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	webResourceCollection <web-resource-collection> : WebResourceCollection[1,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		webResourceName <web-resource-name> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		description <description> : java.lang.String[0,n]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		urlPattern <url-pattern> : java.lang.String[1,n]
 *		  | | 		(
 *		  | | 		  | httpMethod <http-method> : java.lang.String[1,n] 	[pattern ([!-~-[\(\)<>@,;:"/\[\]?=\{\}\\\p{Z}]]+)]
 *		  | | 		  | httpMethodOmission <http-method-omission> : java.lang.String[1,n] 	[pattern ([!-~-[\(\)<>@,;:"/\[\]?=\{\}\\\p{Z}]]+)]
 *		  | | 		)[0,1]
 *		  | | 	authConstraint <auth-constraint> : AuthConstraint[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		description <description> : java.lang.String[0,n]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		roleName <role-name> : java.lang.String[0,n]
 *		  | | 	userDataConstraint <user-data-constraint> : UserDataConstraint[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		description <description> : java.lang.String[0,n]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		transportGuarantee <transport-guarantee> : java.lang.String 	[enumeration (NONE), enumeration (INTEGRAL), enumeration (CONFIDENTIAL)]
 *		  | | loginConfig <login-config> : LoginConfig
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	authMethod <auth-method> : java.lang.String[0,1]
 *		  | | 	realmName <realm-name> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	formLoginConfig <form-login-config> : FormLoginConfig[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		formLoginPage <form-login-page> : java.lang.String 	[pattern (/.*)]
 *		  | | 		formErrorPage <form-error-page> : java.lang.String 	[pattern (/.*)]
 *		  | | securityRole <security-role> : SecurityRole
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	roleName <role-name> : java.lang.String
 *		  | | envEntry <env-entry> : EnvEntry[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	envEntryName <env-entry-name> : java.lang.String
 *		  | | 	envEntryType <env-entry-type> : java.lang.String[0,1]
 *		  | | 	envEntryValue <env-entry-value> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTarget[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | 	lookupName <lookup-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | ejbRef <ejb-ref> : EjbRef[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	ejbRefName <ejb-ref-name> : java.lang.String
 *		  | | 	ejbRefType <ejb-ref-type> : java.lang.String[0,1] 	[enumeration (Entity), enumeration (Session)]
 *		  | | 	home <home> : java.lang.String[0,1]
 *		  | | 	remote <remote> : java.lang.String[0,1]
 *		  | | 	ejbLink <ejb-link> : java.lang.String[0,1]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTarget[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | 	lookupName <lookup-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | ejbLocalRef <ejb-local-ref> : EjbLocalRef[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	ejbRefName <ejb-ref-name> : java.lang.String
 *		  | | 	ejbRefType <ejb-ref-type> : java.lang.String[0,1] 	[enumeration (Entity), enumeration (Session)]
 *		  | | 	localHome <local-home> : java.lang.String[0,1]
 *		  | | 	local <local> : java.lang.String[0,1]
 *		  | | 	ejbLink <ejb-link> : java.lang.String[0,1]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTarget[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | 	lookupName <lookup-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | serviceRef <service-ref> : ServiceRef[0,n] 	[key name='service-ref_handler-name-key']
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	icon <icon> : Icon[0,n]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		smallIcon <small-icon> : java.lang.String[0,1]
 *		  | | 		largeIcon <large-icon> : java.lang.String[0,1]
 *		  | | 	serviceRefName <service-ref-name> : java.lang.String
 *		  | | 	serviceInterface <service-interface> : java.lang.String
 *		  | | 	serviceRefType <service-ref-type> : java.lang.String[0,1]
 *		  | | 	wsdlFile <wsdl-file> : java.net.URI[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	jaxrpcMappingFile <jaxrpc-mapping-file> : java.lang.String[0,1]
 *		  | | 	serviceQname <service-qname> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	portComponentRef <port-component-ref> : PortComponentRef[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		serviceEndpointInterface <service-endpoint-interface> : java.lang.String
 *		  | | 		enableMtom <enable-mtom> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		mtomThreshold <mtom-threshold> : java.math.BigInteger[0,1] 	[minInclusive (0)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		addressing <addressing> : AddressingType[0,1]
 *		  | | 			enabled <enabled> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 			required <required> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 			responses <responses> : java.lang.String[0,1] 	[enumeration (ANONYMOUS), enumeration (NON_ANONYMOUS), enumeration (ALL)]
 *		  | | 		respectBinding <respect-binding> : RespectBindingType[0,1]
 *		  | | 			enabled <enabled> : boolean[0,1] 	[pattern ((true|false))]
 *		  | | 		portComponentLink <port-component-link> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| handler <handler> : ServiceRefHandler[0,n]
 *		  | | 	| 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 	description <description> : java.lang.String[0,n]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	| 	displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	| 	icon <icon> : Icon[0,n]
 *		  | | 	| 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 		smallIcon <small-icon> : java.lang.String[0,1]
 *		  | | 	| 		largeIcon <large-icon> : java.lang.String[0,1]
 *		  | | 	| 	handlerName <handler-name> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 	handlerClass <handler-class> : java.lang.String
 *		  | | 	| 	initParam <init-param> : InitParam[0,n]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 		description <description> : java.lang.String[0,n]
 *		  | | 	| 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	| 		paramName <param-name> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 	| 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 		paramValue <param-value> : java.lang.String
 *		  | | 	| 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 	soapHeader <soap-header> : java.lang.String[0,n]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 	soapRole <soap-role> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 	portName <port-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| handlerChains <handler-chains> : ServiceRefHandlerChains[0,1]
 *		  | | 	| 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 	handlerChain <handler-chain> : ServiceRefHandlerChainType[0,n]
 *		  | | 	| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 		(
 *		  | | 	| 		  | serviceNamePattern <service-name-pattern> : java.lang.String 	[pattern (\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?)]
 *		  | | 	| 		  | portNamePattern <port-name-pattern> : java.lang.String 	[pattern (\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?)]
 *		  | | 	| 		  | protocolBindings <protocol-bindings> : String
 *		  | | 	| 		)[0,1]
 *		  | | 	| 		handler <handler> : ServiceRefHandler[1,n]
 *		  | | 	| 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 			description <description> : java.lang.String[0,n]
 *		  | | 	| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	| 			displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 	| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	| 			icon <icon> : Icon[0,n]
 *		  | | 	| 				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 				smallIcon <small-icon> : java.lang.String[0,1]
 *		  | | 	| 				largeIcon <large-icon> : java.lang.String[0,1]
 *		  | | 	| 			handlerName <handler-name> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 	| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 			handlerClass <handler-class> : java.lang.String
 *		  | | 	| 			initParam <init-param> : InitParam[0,n]
 *		  | | 	| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 				description <description> : java.lang.String[0,n]
 *		  | | 	| 					[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 					[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	| 				paramName <param-name> : java.lang.String 	[whiteSpace (collapse)]
 *		  | | 	| 					[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 				paramValue <param-value> : java.lang.String
 *		  | | 	| 					[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 			soapHeader <soap-header> : java.lang.String[0,n]
 *		  | | 	| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 			soapRole <soap-role> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 	| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	| 			portName <port-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *		  | | 	| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTarget[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | 	lookupName <lookup-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | resourceRef <resource-ref> : ResourceRef[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	resRefName <res-ref-name> : java.lang.String
 *		  | | 	resType <res-type> : java.lang.String[0,1]
 *		  | | 	resAuth <res-auth> : java.lang.String[0,1] 	[enumeration (Application), enumeration (Container)]
 *		  | | 	resSharingScope <res-sharing-scope> : java.lang.String[0,1] 	[enumeration (Shareable), enumeration (Unshareable)]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTarget[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | 	lookupName <lookup-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | resourceEnvRef <resource-env-ref> : ResourceEnvRef[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	resourceEnvRefName <resource-env-ref-name> : java.lang.String
 *		  | | 	resourceEnvRefType <resource-env-ref-type> : java.lang.String[0,1]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTarget[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | 	lookupName <lookup-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | messageDestinationRef <message-destination-ref> : MessageDestinationRef[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	messageDestinationRefName <message-destination-ref-name> : java.lang.String
 *		  | | 	messageDestinationType <message-destination-type> : java.lang.String[0,1]
 *		  | | 	messageDestinationUsage <message-destination-usage> : java.lang.String[0,1] 	[enumeration (Consumes), enumeration (Produces), enumeration (ConsumesProduces)]
 *		  | | 	messageDestinationLink <message-destination-link> : java.lang.String[0,1]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTarget[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | 	lookupName <lookup-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | persistenceContextRef <persistence-context-ref> : PersistenceContextRefType[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	persistenceContextRefName <persistence-context-ref-name> : java.lang.String
 *		  | | 	persistenceUnitName <persistence-unit-name> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	persistenceContextType <persistence-context-type> : java.lang.String[0,1] 	[enumeration (Transaction), enumeration (Extended)]
 *		  | | 	persistenceProperty <persistence-property> : PropertyType[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		name <name> : java.lang.String
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		value <value> : java.lang.String
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTarget[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | persistenceUnitRef <persistence-unit-ref> : PersistenceUnitRefType[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	persistenceUnitRefName <persistence-unit-ref-name> : java.lang.String
 *		  | | 	persistenceUnitName <persistence-unit-name> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	mappedName <mapped-name> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	injectionTarget <injection-target> : InjectionTarget[0,n]
 *		  | | 		injectionTargetClass <injection-target-class> : java.lang.String
 *		  | | 		injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | postConstruct <post-construct> : LifecycleCallbackType[0,n]
 *		  | | 	lifecycleCallbackClass <lifecycle-callback-class> : java.lang.String[0,1]
 *		  | | 	lifecycleCallbackMethod <lifecycle-callback-method> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | preDestroy <pre-destroy> : LifecycleCallbackType[0,n]
 *		  | | 	lifecycleCallbackClass <lifecycle-callback-class> : java.lang.String[0,1]
 *		  | | 	lifecycleCallbackMethod <lifecycle-callback-method> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		  | | dataSource <data-source> : DataSourceType[0,n]
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	description <description> : java.lang.String[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		  | | 	name <name> : java.lang.String
 *		  | | 	className <class-name> : java.lang.String[0,1]
 *		  | | 	serverName <server-name> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	portNumber <port-number> : java.math.BigInteger[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	databaseName <database-name> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	url <url> : java.lang.String[0,1] 	[pattern (jdbc:(.*):(.*))]
 *		  | | 	user <user> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	password <password> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	property2 <property> : PropertyType[0,n]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		name <name> : java.lang.String
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 		value <value> : java.lang.String
 *		  | | 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	loginTimeout <login-timeout> : java.math.BigInteger[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	transactional <transactional> : boolean[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	isolationLevel <isolation-level> : java.lang.String[0,1] 	[enumeration (TRANSACTION_READ_UNCOMMITTED), enumeration (TRANSACTION_READ_COMMITTED), enumeration (TRANSACTION_REPEATABLE_READ), enumeration (TRANSACTION_SERIALIZABLE)]
 *		  | | 	initialPoolSize <initial-pool-size> : java.math.BigInteger[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	maxPoolSize <max-pool-size> : java.math.BigInteger[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	minPoolSize <min-pool-size> : java.math.BigInteger[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	maxIdleTime <max-idle-time> : java.math.BigInteger[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | 	maxStatements <max-statements> : java.math.BigInteger[0,1]
 *		  | | 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | messageDestination <message-destination> : MessageDestination
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | | localeEncodingMappingList <locale-encoding-mapping-list> : LocaleEncodingMappingList
 *		  | | 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		  | ordering <ordering> : RelativeOrdering
 *		)[0,n]
 *	... etc ...
 *
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;
import java.io.*;

// BEGIN_NOI18N

public class WebFragment extends org.netbeans.modules.j2ee.dd.impl.common.ComponentBeanMultiple
	 implements  
                    org.netbeans.modules.j2ee.dd.api.web.WebFragment
            
{

	static Vector comparators = new Vector();
	static{
		WebFragment.addComparator(new org.netbeans.modules.j2ee.dd.impl.common.Comparator());
	}
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	private static final String SERIALIZATION_HELPER_CHARSET = "UTF-8";	// NOI18N

	static public final String VERSION = "Version";	// NOI18N
	static public final String ID = "Id";	// NOI18N
	static public final String METADATACOMPLETE = "MetadataComplete";	// NOI18N
	static public final String NAME = "Name";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String DISPLAY_NAME = "DisplayName";	// NOI18N
	static public final String DISPLAYNAMEID = "DisplayNameId";	// NOI18N
	static public final String DISPLAYNAMEXMLLANG = "DisplayNameXmlLang";	// NOI18N
	static public final String ICON = "Icon";	// NOI18N
	static public final String DISTRIBUTABLE = "Distributable";	// NOI18N
	static public final String CONTEXT_PARAM = "ContextParam";	// NOI18N
	static public final String FILTER = "Filter";	// NOI18N
	static public final String FILTER_MAPPING = "FilterMapping";	// NOI18N
	static public final String LISTENER = "Listener";	// NOI18N
	static public final String SERVLET = "Servlet";	// NOI18N
	static public final String SERVLET_MAPPING = "ServletMapping";	// NOI18N
	static public final String SESSION_CONFIG = "SessionConfig";	// NOI18N
	static public final String MIME_MAPPING = "MimeMapping";	// NOI18N
	static public final String WELCOME_FILE_LIST = "WelcomeFileList";	// NOI18N
	static public final String ERROR_PAGE = "ErrorPage";	// NOI18N
	static public final String JSP_CONFIG = "JspConfig";	// NOI18N
	static public final String SECURITY_CONSTRAINT = "SecurityConstraint";	// NOI18N
	static public final String LOGIN_CONFIG = "LoginConfig";	// NOI18N
	static public final String SECURITY_ROLE = "SecurityRole";	// NOI18N
	static public final String ENV_ENTRY = "EnvEntry";	// NOI18N
	static public final String EJB_REF = "EjbRef";	// NOI18N
	static public final String EJB_LOCAL_REF = "EjbLocalRef";	// NOI18N
	static public final String SERVICE_REF = "ServiceRef";	// NOI18N
	static public final String RESOURCE_REF = "ResourceRef";	// NOI18N
	static public final String RESOURCE_ENV_REF = "ResourceEnvRef";	// NOI18N
	static public final String MESSAGE_DESTINATION_REF = "MessageDestinationRef";	// NOI18N
	static public final String PERSISTENCE_CONTEXT_REF = "PersistenceContextRef";	// NOI18N
	static public final String PERSISTENCE_UNIT_REF = "PersistenceUnitRef";	// NOI18N
	static public final String POST_CONSTRUCT = "PostConstruct";	// NOI18N
	static public final String PRE_DESTROY = "PreDestroy";	// NOI18N
	static public final String DATA_SOURCE = "DataSource";	// NOI18N
	static public final String MESSAGE_DESTINATION = "MessageDestination";	// NOI18N
	static public final String LOCALE_ENCODING_MAPPING_LIST = "LocaleEncodingMappingList";	// NOI18N
	static public final String ORDERING = "Ordering";	// NOI18N

	public WebFragment() {
		this(null, Common.USE_DEFAULT_VALUES);
	}

	public WebFragment(org.w3c.dom.Node doc, int options) {
		this(Common.NO_DEFAULT_VALUES);
		try {
			initFromNode(doc, options);
		}
		catch (Schema2BeansException e) {
			throw new RuntimeException(e);
		}
	}
	protected void initFromNode(org.w3c.dom.Node doc, int options) throws Schema2BeansException
	{
		if (doc == null)
		{
			doc = GraphManager.createRootElementNode("web-fragment");	// NOI18N
			if (doc == null)
				throw new Schema2BeansException(Common.getMessage(
					"CantCreateDOMRoot_msg", "web-fragment"));
		}
		Node n = GraphManager.getElementNode("web-fragment", doc);	// NOI18N
		if (n == null)
			throw new Schema2BeansException(Common.getMessage(
				"DocRootNotInDOMGraph_msg", "web-fragment", doc.getFirstChild().getNodeName()));

		this.graphManager.setXmlDocument(doc);

		// Entry point of the createBeans() recursive calls
		this.createBean(n, this.graphManager());
		this.initialize(options);
	}
	public WebFragment(int options)
	{
		super(comparators, runtimeVersion);
		initOptions(options);
	}
	protected void initOptions(int options)
	{
		// The graph manager is allocated in the bean root
		this.graphManager = new GraphManager(this);
		this.createRoot("web-fragment", "WebFragment",	// NOI18N
			Common.TYPE_1 | Common.TYPE_BEAN, WebFragment.class);

		// Properties (see root bean comments for the bean graph)
		initPropertyTables(34);
		this.createProperty("name", 	// NOI18N
			NAME, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("description", 	// NOI18N
			DESCRIPTION, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(DESCRIPTION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(DESCRIPTION, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("display-name", 	// NOI18N
			DISPLAY_NAME, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(DISPLAY_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(DISPLAY_NAME, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("icon", 	// NOI18N
			ICON, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			Icon.class);
		this.createAttribute(ICON, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(ICON, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("distributable", 	// NOI18N
			DISTRIBUTABLE, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			EmptyType.class);
		this.createAttribute(DISTRIBUTABLE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("context-param", 	// NOI18N
			CONTEXT_PARAM, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			InitParam.class);
		this.createAttribute(CONTEXT_PARAM, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("filter", 	// NOI18N
			FILTER, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			Filter.class);
		this.createAttribute(FILTER, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("filter-mapping", 	// NOI18N
			FILTER_MAPPING, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			FilterMapping.class);
		this.createAttribute(FILTER_MAPPING, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("listener", 	// NOI18N
			LISTENER, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			Listener.class);
		this.createAttribute(LISTENER, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("servlet", 	// NOI18N
			SERVLET, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			Servlet.class);
		this.createAttribute(SERVLET, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("servlet-mapping", 	// NOI18N
			SERVLET_MAPPING, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ServletMapping.class);
		this.createAttribute(SERVLET_MAPPING, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("session-config", 	// NOI18N
			SESSION_CONFIG, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			SessionConfig.class);
		this.createAttribute(SESSION_CONFIG, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("mime-mapping", 	// NOI18N
			MIME_MAPPING, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			MimeMapping.class);
		this.createAttribute(MIME_MAPPING, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("welcome-file-list", 	// NOI18N
			WELCOME_FILE_LIST, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			WelcomeFileList.class);
		this.createAttribute(WELCOME_FILE_LIST, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("error-page", 	// NOI18N
			ERROR_PAGE, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ErrorPage.class);
		this.createAttribute(ERROR_PAGE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("jsp-config", 	// NOI18N
			JSP_CONFIG, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			JspConfig.class);
		this.createAttribute(JSP_CONFIG, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("security-constraint", 	// NOI18N
			SECURITY_CONSTRAINT, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			SecurityConstraint.class);
		this.createAttribute(SECURITY_CONSTRAINT, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("login-config", 	// NOI18N
			LOGIN_CONFIG, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			LoginConfig.class);
		this.createAttribute(LOGIN_CONFIG, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("security-role", 	// NOI18N
			SECURITY_ROLE, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			SecurityRole.class);
		this.createAttribute(SECURITY_ROLE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("env-entry", 	// NOI18N
			ENV_ENTRY, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			EnvEntry.class);
		this.createAttribute(ENV_ENTRY, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("ejb-ref", 	// NOI18N
			EJB_REF, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			EjbRef.class);
		this.createAttribute(EJB_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("ejb-local-ref", 	// NOI18N
			EJB_LOCAL_REF, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			EjbLocalRef.class);
		this.createAttribute(EJB_LOCAL_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("service-ref", 	// NOI18N
			SERVICE_REF, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ServiceRef.class);
		this.createAttribute(SERVICE_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("resource-ref", 	// NOI18N
			RESOURCE_REF, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ResourceRef.class);
		this.createAttribute(RESOURCE_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("resource-env-ref", 	// NOI18N
			RESOURCE_ENV_REF, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ResourceEnvRef.class);
		this.createAttribute(RESOURCE_ENV_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("message-destination-ref", 	// NOI18N
			MESSAGE_DESTINATION_REF, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			MessageDestinationRef.class);
		this.createAttribute(MESSAGE_DESTINATION_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("persistence-context-ref", 	// NOI18N
			PERSISTENCE_CONTEXT_REF, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			PersistenceContextRefType.class);
		this.createAttribute(PERSISTENCE_CONTEXT_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("persistence-unit-ref", 	// NOI18N
			PERSISTENCE_UNIT_REF, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			PersistenceUnitRefType.class);
		this.createAttribute(PERSISTENCE_UNIT_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("post-construct", 	// NOI18N
			POST_CONSTRUCT, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			LifecycleCallbackType.class);
		this.createProperty("pre-destroy", 	// NOI18N
			PRE_DESTROY, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			LifecycleCallbackType.class);
		this.createProperty("data-source", 	// NOI18N
			DATA_SOURCE, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			DataSourceType.class);
		this.createAttribute(DATA_SOURCE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("message-destination", 	// NOI18N
			MESSAGE_DESTINATION, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			MessageDestination.class);
		this.createAttribute(MESSAGE_DESTINATION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("locale-encoding-mapping-list", 	// NOI18N
			LOCALE_ENCODING_MAPPING_LIST, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			LocaleEncodingMappingList.class);
		this.createAttribute(LOCALE_ENCODING_MAPPING_LIST, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("ordering", 	// NOI18N
			ORDERING, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			RelativeOrdering.class);
		this.createAttribute("version", "Version", 
						AttrProp.CDATA | AttrProp.REQUIRED,
						null, "3.0");
		this.createAttribute("id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute("metadata-complete", "MetadataComplete", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.initialize(options);
	}

	// Setting the default values of the properties
	void initialize(int options) {
		setDefaultNamespace("http://java.sun.com/xml/ns/javaee");
		if ((options & Common.USE_DEFAULT_VALUES) == Common.USE_DEFAULT_VALUES) {
			setVersion("3.0");
		}

	}

	// This attribute is mandatory
	public void setVersion(java.lang.String value) {
		setAttributeValue(VERSION, value);
	}

	//
	public java.lang.String getVersion() {
		return getAttributeValue(VERSION);
	}

	// This attribute is optional
	public void setId(java.lang.String value) {
		setAttributeValue(ID, value);
	}

	//
	public java.lang.String getId() {
		return getAttributeValue(ID);
	}

	// This attribute is optional
	public void setMetadataComplete(boolean value) {
		setAttributeValue(METADATACOMPLETE, ""+value);
	}

	//
	public boolean isMetadataComplete() {
		return (getAttributeValue(METADATACOMPLETE) == null) ? false : ("true".equalsIgnoreCase(getAttributeValue(METADATACOMPLETE)) || "1".equals(getAttributeValue(METADATACOMPLETE)));
	}

	// This attribute is an array, possibly empty
	public void setName(int index, java.lang.String value) {
		this.setValue(NAME, index, value);
	}

	//
	public java.lang.String getName(int index) {
		return (java.lang.String)this.getValue(NAME, index);
	}

	// Return the number of properties
	public int sizeName() {
		return this.size(NAME);
	}

	// This attribute is an array, possibly empty
	public void setName(java.lang.String[] value) {
		this.setValue(NAME, value);
	}

	//
	public java.lang.String[] getName() {
		return (java.lang.String[])this.getValues(NAME);
	}

	// Add a new element returning its index in the list
	public int addName(java.lang.String value) {
		int positionOfNewItem = this.addValue(NAME, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeName(java.lang.String value) {
		return this.removeValue(NAME, value);
	}

	// This attribute is an array, possibly empty
	public void setDescription(int index, java.lang.String value) {
		this.setValue(DESCRIPTION, index, value);
	}

	//
	public java.lang.String getDescription(int index) {
		return (java.lang.String)this.getValue(DESCRIPTION, index);
	}

	// Return the number of properties
	public int sizeDescription() {
		return this.size(DESCRIPTION);
	}

	// This attribute is an array, possibly empty
	public void setDescription(java.lang.String[] value) {
		this.setValue(DESCRIPTION, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public java.lang.String[] getDescription() {
		return (java.lang.String[])this.getValues(DESCRIPTION);
	}

	// Add a new element returning its index in the list
	public int addDescription(java.lang.String value) {
		int positionOfNewItem = this.addValue(DESCRIPTION, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeDescription(java.lang.String value) {
		return this.removeValue(DESCRIPTION, value);
	}

	// This attribute is an array, possibly empty
	public void setDescriptionId(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DESCRIPTION) == 0) {
			addValue(DESCRIPTION, "");
		}
		setAttributeValue(DESCRIPTION, index, "Id", value);
	}

	//
	public java.lang.String getDescriptionId(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DESCRIPTION) == 0) {
			return null;
		} else {
			return getAttributeValue(DESCRIPTION, index, "Id");
		}
	}

	// Return the number of properties
	public int sizeDescriptionId() {
		return this.size(DESCRIPTION);
	}

	// This attribute is an array, possibly empty
	public void setDescriptionXmlLang(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DESCRIPTION) == 0) {
			addValue(DESCRIPTION, "");
		}
		setAttributeValue(DESCRIPTION, index, "XmlLang", value);
	}

	//
	public java.lang.String getDescriptionXmlLang(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DESCRIPTION) == 0) {
			return null;
		} else {
			return getAttributeValue(DESCRIPTION, index, "XmlLang");
		}
	}

	// Return the number of properties
	public int sizeDescriptionXmlLang() {
		return this.size(DESCRIPTION);
	}

	// This attribute is an array, possibly empty
	public void setDisplayName(int index, java.lang.String value) {
		this.setValue(DISPLAY_NAME, index, value);
	}

	//
	public java.lang.String getDisplayName(int index) {
		return (java.lang.String)this.getValue(DISPLAY_NAME, index);
	}

	// Return the number of properties
	public int sizeDisplayName() {
		return this.size(DISPLAY_NAME);
	}

	// This attribute is an array, possibly empty
	public void setDisplayName(java.lang.String[] value) {
		this.setValue(DISPLAY_NAME, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public java.lang.String[] getDisplayName() {
		return (java.lang.String[])this.getValues(DISPLAY_NAME);
	}

	// Add a new element returning its index in the list
	public int addDisplayName(java.lang.String value) {
		int positionOfNewItem = this.addValue(DISPLAY_NAME, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeDisplayName(java.lang.String value) {
		return this.removeValue(DISPLAY_NAME, value);
	}

	// This attribute is an array, possibly empty
	public void setDisplayNameId(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DISPLAY_NAME) == 0) {
			addValue(DISPLAY_NAME, "");
		}
		setAttributeValue(DISPLAY_NAME, index, "Id", value);
	}

	//
	public java.lang.String getDisplayNameId(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DISPLAY_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(DISPLAY_NAME, index, "Id");
		}
	}

	// Return the number of properties
	public int sizeDisplayNameId() {
		return this.size(DISPLAY_NAME);
	}

	// This attribute is an array, possibly empty
	public void setDisplayNameXmlLang(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DISPLAY_NAME) == 0) {
			addValue(DISPLAY_NAME, "");
		}
		setAttributeValue(DISPLAY_NAME, index, "XmlLang", value);
	}

	//
	public java.lang.String getDisplayNameXmlLang(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DISPLAY_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(DISPLAY_NAME, index, "XmlLang");
		}
	}

	// Return the number of properties
	public int sizeDisplayNameXmlLang() {
		return this.size(DISPLAY_NAME);
	}

	// This attribute is an array, possibly empty
	public void setIcon(int index,  
                org.netbeans.modules.j2ee.dd.api.common.Icon
             valueInterface) {
		Icon value = (Icon) valueInterface;
		this.setValue(ICON, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.Icon
             getIcon(int index) {
		return (Icon)this.getValue(ICON, index);
	}

	// Return the number of properties
	public int sizeIcon() {
		return this.size(ICON);
	}

	// This attribute is an array, possibly empty
	public void setIcon( 
                org.netbeans.modules.j2ee.dd.api.common.Icon
            [] value) {
		this.setValue(ICON, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.Icon
            [] getIcon() {
		return (Icon[])this.getValues(ICON);
	}

	// Add a new element returning its index in the list
	public int addIcon( 
                org.netbeans.modules.j2ee.dd.api.common.Icon
             valueInterface) {
		Icon value = (Icon) valueInterface;
		int positionOfNewItem = this.addValue(ICON, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeIcon( 
                org.netbeans.modules.j2ee.dd.api.common.Icon
             valueInterface) {
		Icon value = (Icon) valueInterface;
		return this.removeValue(ICON, value);
	}

	// This attribute is an array, possibly empty
	public void setDistributable(int index, EmptyType value) {
		this.setValue(DISTRIBUTABLE, index, value);
	}

	//
	public EmptyType getDistributable(int index) {
		return (EmptyType)this.getValue(DISTRIBUTABLE, index);
	}

	// Return the number of properties
	public int sizeDistributable() {
		return this.size(DISTRIBUTABLE);
	}

	// This attribute is an array, possibly empty
	public void setDistributable(EmptyType[] value) {
		this.setValue(DISTRIBUTABLE, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public EmptyType[] getDistributable() {
		return (EmptyType[])this.getValues(DISTRIBUTABLE);
	}

	// Add a new element returning its index in the list
	public int addDistributable(org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.EmptyType value) {
		int positionOfNewItem = this.addValue(DISTRIBUTABLE, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeDistributable(org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.EmptyType value) {
		return this.removeValue(DISTRIBUTABLE, value);
	}

	// This attribute is an array, possibly empty
	public void setContextParam(int index,  
                    org.netbeans.modules.j2ee.dd.api.common.InitParam valueInterface) {
		InitParam value = (InitParam) valueInterface;
		this.setValue(CONTEXT_PARAM, index, value);
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.common.InitParam getContextParam(int index) {
		return (InitParam)this.getValue(CONTEXT_PARAM, index);
	}

	// Return the number of properties
	public int sizeContextParam() {
		return this.size(CONTEXT_PARAM);
	}

	// This attribute is an array, possibly empty
	public void setContextParam( 
                    org.netbeans.modules.j2ee.dd.api.common.InitParam[] value) {
		this.setValue(CONTEXT_PARAM, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.common.InitParam[] getContextParam() {
		return (InitParam[])this.getValues(CONTEXT_PARAM);
	}

	// Add a new element returning its index in the list
	public int addContextParam( 
                    org.netbeans.modules.j2ee.dd.api.common.InitParam valueInterface) {
		InitParam value = (InitParam) valueInterface;
		int positionOfNewItem = this.addValue(CONTEXT_PARAM, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeContextParam( 
                    org.netbeans.modules.j2ee.dd.api.common.InitParam valueInterface) {
		InitParam value = (InitParam) valueInterface;
		return this.removeValue(CONTEXT_PARAM, value);
	}

	// This attribute is an array, possibly empty
	public void setFilter(int index,  
                    org.netbeans.modules.j2ee.dd.api.web.Filter valueInterface) {
		Filter value = (Filter) valueInterface;
		this.setValue(FILTER, index, value);
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.web.Filter getFilter(int index) {
		return (Filter)this.getValue(FILTER, index);
	}

	// Return the number of properties
	public int sizeFilter() {
		return this.size(FILTER);
	}

	// This attribute is an array, possibly empty
	public void setFilter( 
                    org.netbeans.modules.j2ee.dd.api.web.Filter[] value) {
		this.setValue(FILTER, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.web.Filter[] getFilter() {
		return (Filter[])this.getValues(FILTER);
	}

	// Add a new element returning its index in the list
	public int addFilter( 
                    org.netbeans.modules.j2ee.dd.api.web.Filter valueInterface) {
		Filter value = (Filter) valueInterface;
		int positionOfNewItem = this.addValue(FILTER, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeFilter( 
                    org.netbeans.modules.j2ee.dd.api.web.Filter valueInterface) {
		Filter value = (Filter) valueInterface;
		return this.removeValue(FILTER, value);
	}

	// This attribute is an array, possibly empty
	public void setFilterMapping(int index,  
                    org.netbeans.modules.j2ee.dd.api.web.FilterMapping
                 valueInterface) {
		FilterMapping value = (FilterMapping) valueInterface;
		this.setValue(FILTER_MAPPING, index, value);
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.web.FilterMapping
                 getFilterMapping(int index) {
		return (FilterMapping)this.getValue(FILTER_MAPPING, index);
	}

	// Return the number of properties
	public int sizeFilterMapping() {
		return this.size(FILTER_MAPPING);
	}

	// This attribute is an array, possibly empty
	public void setFilterMapping( 
                    org.netbeans.modules.j2ee.dd.api.web.FilterMapping
                [] value) {
		this.setValue(FILTER_MAPPING, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.web.FilterMapping
                [] getFilterMapping() {
		return (FilterMapping[])this.getValues(FILTER_MAPPING);
	}

	// Add a new element returning its index in the list
	public int addFilterMapping( 
                    org.netbeans.modules.j2ee.dd.api.web.FilterMapping
                 valueInterface) {
		FilterMapping value = (FilterMapping) valueInterface;
		int positionOfNewItem = this.addValue(FILTER_MAPPING, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeFilterMapping( 
                    org.netbeans.modules.j2ee.dd.api.web.FilterMapping
                 valueInterface) {
		FilterMapping value = (FilterMapping) valueInterface;
		return this.removeValue(FILTER_MAPPING, value);
	}

	// This attribute is an array, possibly empty
	public void setListener(int index,  
                org.netbeans.modules.j2ee.dd.api.web.Listener
             valueInterface) {
		Listener value = (Listener) valueInterface;
		this.setValue(LISTENER, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.Listener
             getListener(int index) {
		return (Listener)this.getValue(LISTENER, index);
	}

	// Return the number of properties
	public int sizeListener() {
		return this.size(LISTENER);
	}

	// This attribute is an array, possibly empty
	public void setListener( 
                org.netbeans.modules.j2ee.dd.api.web.Listener
            [] value) {
		this.setValue(LISTENER, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.Listener
            [] getListener() {
		return (Listener[])this.getValues(LISTENER);
	}

	// Add a new element returning its index in the list
	public int addListener( 
                org.netbeans.modules.j2ee.dd.api.web.Listener
             valueInterface) {
		Listener value = (Listener) valueInterface;
		int positionOfNewItem = this.addValue(LISTENER, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeListener( 
                org.netbeans.modules.j2ee.dd.api.web.Listener
             valueInterface) {
		Listener value = (Listener) valueInterface;
		return this.removeValue(LISTENER, value);
	}

	// This attribute is an array, possibly empty
	public void setServlet(int index,  
                org.netbeans.modules.j2ee.dd.api.web.Servlet valueInterface) {
		Servlet value = (Servlet) valueInterface;
		this.setValue(SERVLET, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.Servlet getServlet(int index) {
		return (Servlet)this.getValue(SERVLET, index);
	}

	// Return the number of properties
	public int sizeServlet() {
		return this.size(SERVLET);
	}

	// This attribute is an array, possibly empty
	public void setServlet( 
                org.netbeans.modules.j2ee.dd.api.web.Servlet[] value) {
		this.setValue(SERVLET, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.Servlet[] getServlet() {
		return (Servlet[])this.getValues(SERVLET);
	}

	// Add a new element returning its index in the list
	public int addServlet( 
                org.netbeans.modules.j2ee.dd.api.web.Servlet valueInterface) {
		Servlet value = (Servlet) valueInterface;
		int positionOfNewItem = this.addValue(SERVLET, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeServlet( 
                org.netbeans.modules.j2ee.dd.api.web.Servlet valueInterface) {
		Servlet value = (Servlet) valueInterface;
		return this.removeValue(SERVLET, value);
	}

	// This attribute is an array, possibly empty
	public void setServletMapping(int index,  
                org.netbeans.modules.j2ee.dd.api.web.ServletMapping valueInterface) {
		ServletMapping value = (ServletMapping) valueInterface;
		this.setValue(SERVLET_MAPPING, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.ServletMapping getServletMapping(int index) {
		return (ServletMapping)this.getValue(SERVLET_MAPPING, index);
	}

	// Return the number of properties
	public int sizeServletMapping() {
		return this.size(SERVLET_MAPPING);
	}

	// This attribute is an array, possibly empty
	public void setServletMapping( 
                org.netbeans.modules.j2ee.dd.api.web.ServletMapping[] value) {
		this.setValue(SERVLET_MAPPING, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.ServletMapping[] getServletMapping() {
		return (ServletMapping[])this.getValues(SERVLET_MAPPING);
	}

	// Add a new element returning its index in the list
	public int addServletMapping( 
                org.netbeans.modules.j2ee.dd.api.web.ServletMapping valueInterface) {
		ServletMapping value = (ServletMapping) valueInterface;
		int positionOfNewItem = this.addValue(SERVLET_MAPPING, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeServletMapping( 
                org.netbeans.modules.j2ee.dd.api.web.ServletMapping valueInterface) {
		ServletMapping value = (ServletMapping) valueInterface;
		return this.removeValue(SERVLET_MAPPING, value);
	}

	// This attribute is an array, possibly empty
	public void setSessionConfig(int index,  
                org.netbeans.modules.j2ee.dd.api.web.SessionConfig
             valueInterface) {
		SessionConfig value = (SessionConfig) valueInterface;
		this.setValue(SESSION_CONFIG, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.SessionConfig
             getSessionConfig(int index) {
		return (SessionConfig)this.getValue(SESSION_CONFIG, index);
	}

	// Return the number of properties
	public int sizeSessionConfig() {
		return this.size(SESSION_CONFIG);
	}

	// This attribute is an array, possibly empty
	public void setSessionConfig( 
                org.netbeans.modules.j2ee.dd.api.web.SessionConfig
            [] value) {
		this.setValue(SESSION_CONFIG, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.SessionConfig
            [] getSessionConfig() {
		return (SessionConfig[])this.getValues(SESSION_CONFIG);
	}

	// Add a new element returning its index in the list
	public int addSessionConfig( 
                org.netbeans.modules.j2ee.dd.api.web.SessionConfig
             valueInterface) {
		SessionConfig value = (SessionConfig) valueInterface;
		int positionOfNewItem = this.addValue(SESSION_CONFIG, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeSessionConfig( 
                org.netbeans.modules.j2ee.dd.api.web.SessionConfig
             valueInterface) {
		SessionConfig value = (SessionConfig) valueInterface;
		return this.removeValue(SESSION_CONFIG, value);
	}

	// This attribute is an array, possibly empty
	public void setMimeMapping(int index,  
                org.netbeans.modules.j2ee.dd.api.web.MimeMapping valueInterface) {
		MimeMapping value = (MimeMapping) valueInterface;
		this.setValue(MIME_MAPPING, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.MimeMapping getMimeMapping(int index) {
		return (MimeMapping)this.getValue(MIME_MAPPING, index);
	}

	// Return the number of properties
	public int sizeMimeMapping() {
		return this.size(MIME_MAPPING);
	}

	// This attribute is an array, possibly empty
	public void setMimeMapping( 
                org.netbeans.modules.j2ee.dd.api.web.MimeMapping[] value) {
		this.setValue(MIME_MAPPING, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.MimeMapping[] getMimeMapping() {
		return (MimeMapping[])this.getValues(MIME_MAPPING);
	}

	// Add a new element returning its index in the list
	public int addMimeMapping( 
                org.netbeans.modules.j2ee.dd.api.web.MimeMapping valueInterface) {
		MimeMapping value = (MimeMapping) valueInterface;
		int positionOfNewItem = this.addValue(MIME_MAPPING, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeMimeMapping( 
                org.netbeans.modules.j2ee.dd.api.web.MimeMapping valueInterface) {
		MimeMapping value = (MimeMapping) valueInterface;
		return this.removeValue(MIME_MAPPING, value);
	}

	// This attribute is an array, possibly empty
	public void setWelcomeFileList(int index,  
                org.netbeans.modules.j2ee.dd.api.web.WelcomeFileList
             valueInterface) {
		WelcomeFileList value = (WelcomeFileList) valueInterface;
		this.setValue(WELCOME_FILE_LIST, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.WelcomeFileList
             getWelcomeFileList(int index) {
		return (WelcomeFileList)this.getValue(WELCOME_FILE_LIST, index);
	}

	// Return the number of properties
	public int sizeWelcomeFileList() {
		return this.size(WELCOME_FILE_LIST);
	}

	// This attribute is an array, possibly empty
	public void setWelcomeFileList( 
                org.netbeans.modules.j2ee.dd.api.web.WelcomeFileList
            [] value) {
		this.setValue(WELCOME_FILE_LIST, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.WelcomeFileList
            [] getWelcomeFileList() {
		return (WelcomeFileList[])this.getValues(WELCOME_FILE_LIST);
	}

	// Add a new element returning its index in the list
	public int addWelcomeFileList( 
                org.netbeans.modules.j2ee.dd.api.web.WelcomeFileList
             valueInterface) {
		WelcomeFileList value = (WelcomeFileList) valueInterface;
		int positionOfNewItem = this.addValue(WELCOME_FILE_LIST, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeWelcomeFileList( 
                org.netbeans.modules.j2ee.dd.api.web.WelcomeFileList
             valueInterface) {
		WelcomeFileList value = (WelcomeFileList) valueInterface;
		return this.removeValue(WELCOME_FILE_LIST, value);
	}

	// This attribute is an array, possibly empty
	public void setErrorPage(int index,  
                org.netbeans.modules.j2ee.dd.api.web.ErrorPage valueInterface) {
		ErrorPage value = (ErrorPage) valueInterface;
		this.setValue(ERROR_PAGE, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.ErrorPage getErrorPage(int index) {
		return (ErrorPage)this.getValue(ERROR_PAGE, index);
	}

	// Return the number of properties
	public int sizeErrorPage() {
		return this.size(ERROR_PAGE);
	}

	// This attribute is an array, possibly empty
	public void setErrorPage( 
                org.netbeans.modules.j2ee.dd.api.web.ErrorPage[] value) {
		this.setValue(ERROR_PAGE, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.ErrorPage[] getErrorPage() {
		return (ErrorPage[])this.getValues(ERROR_PAGE);
	}

	// Add a new element returning its index in the list
	public int addErrorPage( 
                org.netbeans.modules.j2ee.dd.api.web.ErrorPage valueInterface) {
		ErrorPage value = (ErrorPage) valueInterface;
		int positionOfNewItem = this.addValue(ERROR_PAGE, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeErrorPage( 
                org.netbeans.modules.j2ee.dd.api.web.ErrorPage valueInterface) {
		ErrorPage value = (ErrorPage) valueInterface;
		return this.removeValue(ERROR_PAGE, value);
	}

	// This attribute is an array, possibly empty
	public void setJspConfig(int index,  
                    org.netbeans.modules.j2ee.dd.api.web.JspConfig
                 valueInterface) {
		JspConfig value = (JspConfig) valueInterface;
		this.setValue(JSP_CONFIG, index, value);
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.web.JspConfig
                 getJspConfig(int index) {
		return (JspConfig)this.getValue(JSP_CONFIG, index);
	}

	// Return the number of properties
	public int sizeJspConfig() {
		return this.size(JSP_CONFIG);
	}

	// This attribute is an array, possibly empty
	public void setJspConfig( 
                    org.netbeans.modules.j2ee.dd.api.web.JspConfig
                [] value) {
		this.setValue(JSP_CONFIG, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.web.JspConfig
                [] getJspConfig() {
		return (JspConfig[])this.getValues(JSP_CONFIG);
	}

	// Add a new element returning its index in the list
	public int addJspConfig( 
                    org.netbeans.modules.j2ee.dd.api.web.JspConfig
                 valueInterface) {
		JspConfig value = (JspConfig) valueInterface;
		int positionOfNewItem = this.addValue(JSP_CONFIG, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeJspConfig( 
                    org.netbeans.modules.j2ee.dd.api.web.JspConfig
                 valueInterface) {
		JspConfig value = (JspConfig) valueInterface;
		return this.removeValue(JSP_CONFIG, value);
	}

	// This attribute is an array, possibly empty
	public void setSecurityConstraint(int index,  
                    org.netbeans.modules.j2ee.dd.api.web.SecurityConstraint
                 valueInterface) {
		SecurityConstraint value = (SecurityConstraint) valueInterface;
		this.setValue(SECURITY_CONSTRAINT, index, value);
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.web.SecurityConstraint
                 getSecurityConstraint(int index) {
		return (SecurityConstraint)this.getValue(SECURITY_CONSTRAINT, index);
	}

	// Return the number of properties
	public int sizeSecurityConstraint() {
		return this.size(SECURITY_CONSTRAINT);
	}

	// This attribute is an array, possibly empty
	public void setSecurityConstraint( 
                    org.netbeans.modules.j2ee.dd.api.web.SecurityConstraint
                [] value) {
		this.setValue(SECURITY_CONSTRAINT, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.web.SecurityConstraint
                [] getSecurityConstraint() {
		return (SecurityConstraint[])this.getValues(SECURITY_CONSTRAINT);
	}

	// Add a new element returning its index in the list
	public int addSecurityConstraint( 
                    org.netbeans.modules.j2ee.dd.api.web.SecurityConstraint
                 valueInterface) {
		SecurityConstraint value = (SecurityConstraint) valueInterface;
		int positionOfNewItem = this.addValue(SECURITY_CONSTRAINT, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeSecurityConstraint( 
                    org.netbeans.modules.j2ee.dd.api.web.SecurityConstraint
                 valueInterface) {
		SecurityConstraint value = (SecurityConstraint) valueInterface;
		return this.removeValue(SECURITY_CONSTRAINT, value);
	}

	// This attribute is an array, possibly empty
	public void setLoginConfig(int index,  
                    org.netbeans.modules.j2ee.dd.api.web.LoginConfig
                 valueInterface) {
		LoginConfig value = (LoginConfig) valueInterface;
		this.setValue(LOGIN_CONFIG, index, value);
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.web.LoginConfig
                 getLoginConfig(int index) {
		return (LoginConfig)this.getValue(LOGIN_CONFIG, index);
	}

	// Return the number of properties
	public int sizeLoginConfig() {
		return this.size(LOGIN_CONFIG);
	}

	// This attribute is an array, possibly empty
	public void setLoginConfig( 
                    org.netbeans.modules.j2ee.dd.api.web.LoginConfig
                [] value) {
		this.setValue(LOGIN_CONFIG, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.web.LoginConfig
                [] getLoginConfig() {
		return (LoginConfig[])this.getValues(LOGIN_CONFIG);
	}

	// Add a new element returning its index in the list
	public int addLoginConfig( 
                    org.netbeans.modules.j2ee.dd.api.web.LoginConfig
                 valueInterface) {
		LoginConfig value = (LoginConfig) valueInterface;
		int positionOfNewItem = this.addValue(LOGIN_CONFIG, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeLoginConfig( 
                    org.netbeans.modules.j2ee.dd.api.web.LoginConfig
                 valueInterface) {
		LoginConfig value = (LoginConfig) valueInterface;
		return this.removeValue(LOGIN_CONFIG, value);
	}

	// This attribute is an array, possibly empty
	public void setSecurityRole(int index,  
                org.netbeans.modules.j2ee.dd.api.common.SecurityRole valueInterface) {
		SecurityRole value = (SecurityRole) valueInterface;
		this.setValue(SECURITY_ROLE, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.SecurityRole getSecurityRole(int index) {
		return (SecurityRole)this.getValue(SECURITY_ROLE, index);
	}

	// Return the number of properties
	public int sizeSecurityRole() {
		return this.size(SECURITY_ROLE);
	}

	// This attribute is an array, possibly empty
	public void setSecurityRole( 
                org.netbeans.modules.j2ee.dd.api.common.SecurityRole[] value) {
		this.setValue(SECURITY_ROLE, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.SecurityRole[] getSecurityRole() {
		return (SecurityRole[])this.getValues(SECURITY_ROLE);
	}

	// Add a new element returning its index in the list
	public int addSecurityRole( 
                org.netbeans.modules.j2ee.dd.api.common.SecurityRole valueInterface) {
		SecurityRole value = (SecurityRole) valueInterface;
		int positionOfNewItem = this.addValue(SECURITY_ROLE, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeSecurityRole( 
                org.netbeans.modules.j2ee.dd.api.common.SecurityRole valueInterface) {
		SecurityRole value = (SecurityRole) valueInterface;
		return this.removeValue(SECURITY_ROLE, value);
	}

	// This attribute is an array, possibly empty
	public void setEnvEntry(int index,  
                org.netbeans.modules.j2ee.dd.api.common.EnvEntry valueInterface) {
		EnvEntry value = (EnvEntry) valueInterface;
		this.setValue(ENV_ENTRY, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.EnvEntry getEnvEntry(int index) {
		return (EnvEntry)this.getValue(ENV_ENTRY, index);
	}

	// Return the number of properties
	public int sizeEnvEntry() {
		return this.size(ENV_ENTRY);
	}

	// This attribute is an array, possibly empty
	public void setEnvEntry( 
                org.netbeans.modules.j2ee.dd.api.common.EnvEntry[] value) {
		this.setValue(ENV_ENTRY, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.EnvEntry[] getEnvEntry() {
		return (EnvEntry[])this.getValues(ENV_ENTRY);
	}

	// Add a new element returning its index in the list
	public int addEnvEntry( 
                org.netbeans.modules.j2ee.dd.api.common.EnvEntry valueInterface) {
		EnvEntry value = (EnvEntry) valueInterface;
		int positionOfNewItem = this.addValue(ENV_ENTRY, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeEnvEntry( 
                org.netbeans.modules.j2ee.dd.api.common.EnvEntry valueInterface) {
		EnvEntry value = (EnvEntry) valueInterface;
		return this.removeValue(ENV_ENTRY, value);
	}

	// This attribute is an array, possibly empty
	public void setEjbRef(int index,  
                org.netbeans.modules.j2ee.dd.api.common.EjbRef valueInterface) {
		EjbRef value = (EjbRef) valueInterface;
		this.setValue(EJB_REF, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.EjbRef getEjbRef(int index) {
		return (EjbRef)this.getValue(EJB_REF, index);
	}

	// Return the number of properties
	public int sizeEjbRef() {
		return this.size(EJB_REF);
	}

	// This attribute is an array, possibly empty
	public void setEjbRef( 
                org.netbeans.modules.j2ee.dd.api.common.EjbRef[] value) {
		this.setValue(EJB_REF, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.EjbRef[] getEjbRef() {
		return (EjbRef[])this.getValues(EJB_REF);
	}

	// Add a new element returning its index in the list
	public int addEjbRef( 
                org.netbeans.modules.j2ee.dd.api.common.EjbRef valueInterface) {
		EjbRef value = (EjbRef) valueInterface;
		int positionOfNewItem = this.addValue(EJB_REF, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeEjbRef( 
                org.netbeans.modules.j2ee.dd.api.common.EjbRef valueInterface) {
		EjbRef value = (EjbRef) valueInterface;
		return this.removeValue(EJB_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setEjbLocalRef(int index,  
                org.netbeans.modules.j2ee.dd.api.common.EjbLocalRef valueInterface) {
		EjbLocalRef value = (EjbLocalRef) valueInterface;
		this.setValue(EJB_LOCAL_REF, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.EjbLocalRef getEjbLocalRef(int index) {
		return (EjbLocalRef)this.getValue(EJB_LOCAL_REF, index);
	}

	// Return the number of properties
	public int sizeEjbLocalRef() {
		return this.size(EJB_LOCAL_REF);
	}

	// This attribute is an array, possibly empty
	public void setEjbLocalRef( 
                org.netbeans.modules.j2ee.dd.api.common.EjbLocalRef[] value) {
		this.setValue(EJB_LOCAL_REF, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.EjbLocalRef[] getEjbLocalRef() {
		return (EjbLocalRef[])this.getValues(EJB_LOCAL_REF);
	}

	// Add a new element returning its index in the list
	public int addEjbLocalRef( 
                org.netbeans.modules.j2ee.dd.api.common.EjbLocalRef valueInterface) {
		EjbLocalRef value = (EjbLocalRef) valueInterface;
		int positionOfNewItem = this.addValue(EJB_LOCAL_REF, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeEjbLocalRef( 
                org.netbeans.modules.j2ee.dd.api.common.EjbLocalRef valueInterface) {
		EjbLocalRef value = (EjbLocalRef) valueInterface;
		return this.removeValue(EJB_LOCAL_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setServiceRef(int index,  
                org.netbeans.modules.j2ee.dd.api.common.ServiceRef valueInterface) {
		ServiceRef value = (ServiceRef) valueInterface;
		this.setValue(SERVICE_REF, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.ServiceRef getServiceRef(int index) {
		return (ServiceRef)this.getValue(SERVICE_REF, index);
	}

	// Return the number of properties
	public int sizeServiceRef() {
		return this.size(SERVICE_REF);
	}

	// This attribute is an array, possibly empty
	public void setServiceRef( 
                org.netbeans.modules.j2ee.dd.api.common.ServiceRef[] value) {
		this.setValue(SERVICE_REF, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.ServiceRef[] getServiceRef() {
		return (ServiceRef[])this.getValues(SERVICE_REF);
	}

	// Add a new element returning its index in the list
	public int addServiceRef( 
                org.netbeans.modules.j2ee.dd.api.common.ServiceRef valueInterface) {
		ServiceRef value = (ServiceRef) valueInterface;
		int positionOfNewItem = this.addValue(SERVICE_REF, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeServiceRef( 
                org.netbeans.modules.j2ee.dd.api.common.ServiceRef valueInterface) {
		ServiceRef value = (ServiceRef) valueInterface;
		return this.removeValue(SERVICE_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setResourceRef(int index,  
                org.netbeans.modules.j2ee.dd.api.common.ResourceRef valueInterface) {
		ResourceRef value = (ResourceRef) valueInterface;
		this.setValue(RESOURCE_REF, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.ResourceRef getResourceRef(int index) {
		return (ResourceRef)this.getValue(RESOURCE_REF, index);
	}

	// Return the number of properties
	public int sizeResourceRef() {
		return this.size(RESOURCE_REF);
	}

	// This attribute is an array, possibly empty
	public void setResourceRef( 
                org.netbeans.modules.j2ee.dd.api.common.ResourceRef[] value) {
		this.setValue(RESOURCE_REF, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.ResourceRef[] getResourceRef() {
		return (ResourceRef[])this.getValues(RESOURCE_REF);
	}

	// Add a new element returning its index in the list
	public int addResourceRef( 
                org.netbeans.modules.j2ee.dd.api.common.ResourceRef valueInterface) {
		ResourceRef value = (ResourceRef) valueInterface;
		int positionOfNewItem = this.addValue(RESOURCE_REF, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeResourceRef( 
                org.netbeans.modules.j2ee.dd.api.common.ResourceRef valueInterface) {
		ResourceRef value = (ResourceRef) valueInterface;
		return this.removeValue(RESOURCE_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setResourceEnvRef(int index,  
                org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef valueInterface) {
		ResourceEnvRef value = (ResourceEnvRef) valueInterface;
		this.setValue(RESOURCE_ENV_REF, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef getResourceEnvRef(int index) {
		return (ResourceEnvRef)this.getValue(RESOURCE_ENV_REF, index);
	}

	// Return the number of properties
	public int sizeResourceEnvRef() {
		return this.size(RESOURCE_ENV_REF);
	}

	// This attribute is an array, possibly empty
	public void setResourceEnvRef( 
                org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef[] value) {
		this.setValue(RESOURCE_ENV_REF, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef[] getResourceEnvRef() {
		return (ResourceEnvRef[])this.getValues(RESOURCE_ENV_REF);
	}

	// Add a new element returning its index in the list
	public int addResourceEnvRef( 
                org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef valueInterface) {
		ResourceEnvRef value = (ResourceEnvRef) valueInterface;
		int positionOfNewItem = this.addValue(RESOURCE_ENV_REF, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeResourceEnvRef( 
                org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef valueInterface) {
		ResourceEnvRef value = (ResourceEnvRef) valueInterface;
		return this.removeValue(RESOURCE_ENV_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setMessageDestinationRef(int index,  
                org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef valueInterface) {
		MessageDestinationRef value = (MessageDestinationRef) valueInterface;
		this.setValue(MESSAGE_DESTINATION_REF, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef getMessageDestinationRef(int index) {
		return (MessageDestinationRef)this.getValue(MESSAGE_DESTINATION_REF, index);
	}

	// Return the number of properties
	public int sizeMessageDestinationRef() {
		return this.size(MESSAGE_DESTINATION_REF);
	}

	// This attribute is an array, possibly empty
	public void setMessageDestinationRef( 
                org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef[] value) {
		this.setValue(MESSAGE_DESTINATION_REF, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef[] getMessageDestinationRef() {
		return (MessageDestinationRef[])this.getValues(MESSAGE_DESTINATION_REF);
	}

	// Add a new element returning its index in the list
	public int addMessageDestinationRef( 
                org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef valueInterface) {
		MessageDestinationRef value = (MessageDestinationRef) valueInterface;
		int positionOfNewItem = this.addValue(MESSAGE_DESTINATION_REF, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeMessageDestinationRef( 
                org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef valueInterface) {
		MessageDestinationRef value = (MessageDestinationRef) valueInterface;
		return this.removeValue(MESSAGE_DESTINATION_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setPersistenceContextRef(int index, PersistenceContextRefType value) {
		this.setValue(PERSISTENCE_CONTEXT_REF, index, value);
	}

	//
	public PersistenceContextRefType getPersistenceContextRef(int index) {
		return (PersistenceContextRefType)this.getValue(PERSISTENCE_CONTEXT_REF, index);
	}

	// Return the number of properties
	public int sizePersistenceContextRef() {
		return this.size(PERSISTENCE_CONTEXT_REF);
	}

	// This attribute is an array, possibly empty
	public void setPersistenceContextRef(PersistenceContextRefType[] value) {
		this.setValue(PERSISTENCE_CONTEXT_REF, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

	//
	public PersistenceContextRefType[] getPersistenceContextRef() {
		return (PersistenceContextRefType[])this.getValues(PERSISTENCE_CONTEXT_REF);
	}

	// Add a new element returning its index in the list
	public int addPersistenceContextRef(org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.PersistenceContextRefType value) {
		int positionOfNewItem = this.addValue(PERSISTENCE_CONTEXT_REF, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePersistenceContextRef(org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.PersistenceContextRefType value) {
		return this.removeValue(PERSISTENCE_CONTEXT_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setPersistenceUnitRef(int index, PersistenceUnitRefType value) {
		this.setValue(PERSISTENCE_UNIT_REF, index, value);
	}

	//
	public PersistenceUnitRefType getPersistenceUnitRef(int index) {
		return (PersistenceUnitRefType)this.getValue(PERSISTENCE_UNIT_REF, index);
	}

	// Return the number of properties
	public int sizePersistenceUnitRef() {
		return this.size(PERSISTENCE_UNIT_REF);
	}

	// This attribute is an array, possibly empty
	public void setPersistenceUnitRef(PersistenceUnitRefType[] value) {
		this.setValue(PERSISTENCE_UNIT_REF, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

	//
	public PersistenceUnitRefType[] getPersistenceUnitRef() {
		return (PersistenceUnitRefType[])this.getValues(PERSISTENCE_UNIT_REF);
	}

	// Add a new element returning its index in the list
	public int addPersistenceUnitRef(org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.PersistenceUnitRefType value) {
		int positionOfNewItem = this.addValue(PERSISTENCE_UNIT_REF, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePersistenceUnitRef(org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.PersistenceUnitRefType value) {
		return this.removeValue(PERSISTENCE_UNIT_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setPostConstruct(int index, LifecycleCallbackType value) {
		this.setValue(POST_CONSTRUCT, index, value);
	}

	//
	public LifecycleCallbackType getPostConstruct(int index) {
		return (LifecycleCallbackType)this.getValue(POST_CONSTRUCT, index);
	}

	// Return the number of properties
	public int sizePostConstruct() {
		return this.size(POST_CONSTRUCT);
	}

	// This attribute is an array, possibly empty
	public void setPostConstruct(LifecycleCallbackType[] value) {
		this.setValue(POST_CONSTRUCT, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

	//
	public LifecycleCallbackType[] getPostConstruct() {
		return (LifecycleCallbackType[])this.getValues(POST_CONSTRUCT);
	}

	// Add a new element returning its index in the list
	public int addPostConstruct(org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.LifecycleCallbackType value) {
		int positionOfNewItem = this.addValue(POST_CONSTRUCT, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePostConstruct(org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.LifecycleCallbackType value) {
		return this.removeValue(POST_CONSTRUCT, value);
	}

	// This attribute is an array, possibly empty
	public void setPreDestroy(int index, LifecycleCallbackType value) {
		this.setValue(PRE_DESTROY, index, value);
	}

	//
	public LifecycleCallbackType getPreDestroy(int index) {
		return (LifecycleCallbackType)this.getValue(PRE_DESTROY, index);
	}

	// Return the number of properties
	public int sizePreDestroy() {
		return this.size(PRE_DESTROY);
	}

	// This attribute is an array, possibly empty
	public void setPreDestroy(LifecycleCallbackType[] value) {
		this.setValue(PRE_DESTROY, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

	//
	public LifecycleCallbackType[] getPreDestroy() {
		return (LifecycleCallbackType[])this.getValues(PRE_DESTROY);
	}

	// Add a new element returning its index in the list
	public int addPreDestroy(org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.LifecycleCallbackType value) {
		int positionOfNewItem = this.addValue(PRE_DESTROY, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePreDestroy(org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.LifecycleCallbackType value) {
		return this.removeValue(PRE_DESTROY, value);
	}

	// This attribute is an array, possibly empty
	public void setDataSource(int index, DataSourceType value) {
		this.setValue(DATA_SOURCE, index, value);
	}

	//
	public DataSourceType getDataSource(int index) {
		return (DataSourceType)this.getValue(DATA_SOURCE, index);
	}

	// Return the number of properties
	public int sizeDataSource() {
		return this.size(DATA_SOURCE);
	}

	// This attribute is an array, possibly empty
	public void setDataSource(DataSourceType[] value) {
		this.setValue(DATA_SOURCE, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

	//
	public DataSourceType[] getDataSource() {
		return (DataSourceType[])this.getValues(DATA_SOURCE);
	}

	// Add a new element returning its index in the list
	public int addDataSource(org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.DataSourceType value) {
		int positionOfNewItem = this.addValue(DATA_SOURCE, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeDataSource(org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.DataSourceType value) {
		return this.removeValue(DATA_SOURCE, value);
	}

	// This attribute is an array, possibly empty
	public void setMessageDestination(int index,  
                org.netbeans.modules.j2ee.dd.api.common.MessageDestination valueInterface) {
		MessageDestination value = (MessageDestination) valueInterface;
		this.setValue(MESSAGE_DESTINATION, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.MessageDestination getMessageDestination(int index) {
		return (MessageDestination)this.getValue(MESSAGE_DESTINATION, index);
	}

	// Return the number of properties
	public int sizeMessageDestination() {
		return this.size(MESSAGE_DESTINATION);
	}

	// This attribute is an array, possibly empty
	public void setMessageDestination( 
                org.netbeans.modules.j2ee.dd.api.common.MessageDestination[] value) {
		this.setValue(MESSAGE_DESTINATION, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
		}
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.MessageDestination[] getMessageDestination() {
		return (MessageDestination[])this.getValues(MESSAGE_DESTINATION);
	}

	// Add a new element returning its index in the list
	public int addMessageDestination( 
                org.netbeans.modules.j2ee.dd.api.common.MessageDestination valueInterface) {
		MessageDestination value = (MessageDestination) valueInterface;
		int positionOfNewItem = this.addValue(MESSAGE_DESTINATION, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeMessageDestination( 
                org.netbeans.modules.j2ee.dd.api.common.MessageDestination valueInterface) {
		MessageDestination value = (MessageDestination) valueInterface;
		return this.removeValue(MESSAGE_DESTINATION, value);
	}

	// This attribute is an array, possibly empty
	public void setLocaleEncodingMappingList(int index,  
                    org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMappingList
                 valueInterface) {
		LocaleEncodingMappingList value = (LocaleEncodingMappingList) valueInterface;
		this.setValue(LOCALE_ENCODING_MAPPING_LIST, index, value);
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMappingList
                 getLocaleEncodingMappingList(int index) {
		return (LocaleEncodingMappingList)this.getValue(LOCALE_ENCODING_MAPPING_LIST, index);
	}

	// Return the number of properties
	public int sizeLocaleEncodingMappingList() {
		return this.size(LOCALE_ENCODING_MAPPING_LIST);
	}

	// This attribute is an array, possibly empty
	public void setLocaleEncodingMappingList( 
                    org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMappingList
                [] value) {
		this.setValue(LOCALE_ENCODING_MAPPING_LIST, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
		}
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMappingList
                [] getLocaleEncodingMappingList() {
		return (LocaleEncodingMappingList[])this.getValues(LOCALE_ENCODING_MAPPING_LIST);
	}

	// Add a new element returning its index in the list
	public int addLocaleEncodingMappingList( 
                    org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMappingList
                 valueInterface) {
		LocaleEncodingMappingList value = (LocaleEncodingMappingList) valueInterface;
		int positionOfNewItem = this.addValue(LOCALE_ENCODING_MAPPING_LIST, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			setDataSource(null);
			
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeLocaleEncodingMappingList( 
                    org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMappingList
                 valueInterface) {
		LocaleEncodingMappingList value = (LocaleEncodingMappingList) valueInterface;
		return this.removeValue(LOCALE_ENCODING_MAPPING_LIST, value);
	}

	// This attribute is an array, possibly empty
	public void setOrdering(int index, 
                org.netbeans.modules.j2ee.dd.api.web.RelativeOrdering
             valueInterface) {
		RelativeOrdering value = (RelativeOrdering) valueInterface;
		this.setValue(ORDERING, index, value);
	}

	//
	public 
                org.netbeans.modules.j2ee.dd.api.web.RelativeOrdering
             getOrdering(int index) {
		return (RelativeOrdering)this.getValue(ORDERING, index);
	}

	// Return the number of properties
	public int sizeOrdering() {
		return this.size(ORDERING);
	}

	// This attribute is an array, possibly empty
	public void setOrdering(
                org.netbeans.modules.j2ee.dd.api.web.RelativeOrdering
            [] value) {
		this.setValue(ORDERING, value);
	}

	//
	public 
                org.netbeans.modules.j2ee.dd.api.web.RelativeOrdering
            [] getOrdering() {
		return (RelativeOrdering[])this.getValues(ORDERING);
	}

	// Add a new element returning its index in the list
	public int addOrdering(
                org.netbeans.modules.j2ee.dd.api.web.RelativeOrdering
             valueInterface) {
		RelativeOrdering value = (RelativeOrdering) valueInterface;
		int positionOfNewItem = this.addValue(ORDERING, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeOrdering(
                org.netbeans.modules.j2ee.dd.api.web.RelativeOrdering
             valueInterface) {
		RelativeOrdering value = (RelativeOrdering) valueInterface;
		return this.removeValue(ORDERING, value);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.Icon newIcon() {
		return new Icon();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public EmptyType newEmptyType() {
		return new EmptyType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.InitParam newInitParam() {
		return new InitParam();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.Filter newFilter() {
		return new Filter();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.FilterMapping newFilterMapping() {
		return new FilterMapping();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.Listener newListener() {
		return new Listener();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.Servlet newServlet() {
		return new Servlet();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.ServletMapping newServletMapping25() {
		return new ServletMapping();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.SessionConfig newSessionConfig() {
		return new SessionConfig();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.MimeMapping newMimeMapping() {
		return new MimeMapping();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.WelcomeFileList newWelcomeFileList() {
		return new WelcomeFileList();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.ErrorPage newErrorPage() {
		return new ErrorPage();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.JspConfig newJspConfig() {
		return new JspConfig();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.SecurityConstraint newSecurityConstraint() {
		return new SecurityConstraint();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.LoginConfig newLoginConfig() {
		return new LoginConfig();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.SecurityRole newSecurityRole() {
		return new SecurityRole();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.EnvEntry newEnvEntry() {
		return new EnvEntry();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.EjbRef newEjbRef() {
		return new EjbRef();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.EjbLocalRef newEjbLocalRef() {
		return new EjbLocalRef();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.ServiceRef newServiceRef() {
		return new ServiceRef();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.ResourceRef newResourceRef() {
		return new ResourceRef();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef newResourceEnvRef() {
		return new ResourceEnvRef();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef newMessageDestinationRef() {
		return new MessageDestinationRef();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public PersistenceContextRefType newPersistenceContextRefType() {
		return new PersistenceContextRefType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public PersistenceUnitRefType newPersistenceUnitRefType() {
		return new PersistenceUnitRefType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public LifecycleCallbackType newLifecycleCallbackType() {
		return new LifecycleCallbackType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public DataSourceType newDataSourceType() {
		return new DataSourceType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.MessageDestination newMessageDestination() {
		return new MessageDestination();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMappingList newLocaleEncodingMappingList() {
		return new LocaleEncodingMappingList();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.RelativeOrdering newRelativeOrdering() {
		return new RelativeOrdering();
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}
	//
	// This method returns the root of the bean graph
	// Each call creates a new bean graph from the specified DOM graph
	//
	public static WebFragment createGraph(org.w3c.dom.Node doc) {
		return new WebFragment(doc, Common.NO_DEFAULT_VALUES);
	}

	public static WebFragment createGraph(java.io.File f) throws java.io.IOException {
		java.io.InputStream in = new java.io.FileInputStream(f);
		try {
			return createGraph(in, false);
		} finally {
			in.close();
		}
	}

	public static WebFragment createGraph(java.io.InputStream in) {
		return createGraph(in, false);
	}

	public static WebFragment createGraph(java.io.InputStream in, boolean validate) {
		try {
			Document doc = GraphManager.createXmlDocument(in, validate);
			return createGraph(doc);
		}
		catch (Exception t) {
			throw new RuntimeException(Common.getMessage(
				"DOMGraphCreateFailed_msg",
				t));
		}
	}

	//
	// This method returns the root for a new empty bean graph
	//
	public static WebFragment createGraph() {
		return new WebFragment();
	}


	
                    public org.xml.sax.SAXParseException getError() {
                        return null;
                    }
                    public int getStatus() {
                        return STATE_VALID;
                    }
                    // due to compatibility with servlet2.3
                    public void setTaglib(int index, org.netbeans.modules.j2ee.dd.api.web.Taglib valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                        throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(VERSION_3_0);
                    }
                    public org.netbeans.modules.j2ee.dd.api.web.Taglib getTaglib(int index) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                        throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(VERSION_3_0);
                    }
                    public void setTaglib(org.netbeans.modules.j2ee.dd.api.web.Taglib[] value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                        throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(VERSION_3_0);
                    }
                    public org.netbeans.modules.j2ee.dd.api.web.Taglib[] getTaglib() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                        throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(VERSION_3_0);
                    }
                    public int sizeTaglib() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                        throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(VERSION_3_0);
                    }
                    public int addTaglib(org.netbeans.modules.j2ee.dd.api.web.Taglib valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                        throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(VERSION_3_0);
                    }
                    public int removeTaglib(org.netbeans.modules.j2ee.dd.api.web.Taglib valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                        throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(VERSION_3_0);
                    }
                    public void setJspConfig(org.netbeans.modules.j2ee.dd.api.web.JspConfig value) {
                        if (value==null) setJspConfig(new org.netbeans.modules.j2ee.dd.api.web.JspConfig[]{});
                        else setJspConfig(new org.netbeans.modules.j2ee.dd.api.web.JspConfig[]{value});
                    }
                    public org.netbeans.modules.j2ee.dd.api.web.JspConfig getSingleJspConfig() {
                        org.netbeans.modules.j2ee.dd.api.web.JspConfig[] values = getJspConfig();
                        if (values==null || values.length==0) return null;
                        else return values[0];
                    }
                    public void setWelcomeFileList(org.netbeans.modules.j2ee.dd.api.web.WelcomeFileList value) {
                        if (value==null) setWelcomeFileList(new org.netbeans.modules.j2ee.dd.api.web.WelcomeFileList[]{});
                        setWelcomeFileList(new org.netbeans.modules.j2ee.dd.api.web.WelcomeFileList[]{value});
                    }
                    public org.netbeans.modules.j2ee.dd.api.web.WelcomeFileList getSingleWelcomeFileList() {
                        org.netbeans.modules.j2ee.dd.api.web.WelcomeFileList[] values = getWelcomeFileList();
                        if (values==null || values.length==0) return null;
                        else return values[0];
                    }
                    public void setSessionConfig(org.netbeans.modules.j2ee.dd.api.web.SessionConfig value) {
                        if (value==null) setSessionConfig(new org.netbeans.modules.j2ee.dd.api.web.SessionConfig[]{});
                        else setSessionConfig(new org.netbeans.modules.j2ee.dd.api.web.SessionConfig[]{value});
                    }
                    public org.netbeans.modules.j2ee.dd.api.web.SessionConfig getSingleSessionConfig() {
                        org.netbeans.modules.j2ee.dd.api.web.SessionConfig[] values = getSessionConfig();
                        if (values==null || values.length==0) return null;
                        else return values[0];
                    }
                    public void setLoginConfig(org.netbeans.modules.j2ee.dd.api.web.LoginConfig value) {
                        if (value==null) setLoginConfig(new org.netbeans.modules.j2ee.dd.api.web.LoginConfig[]{});
                        else setLoginConfig(new org.netbeans.modules.j2ee.dd.api.web.LoginConfig[]{value});
                    }
                    public org.netbeans.modules.j2ee.dd.api.web.LoginConfig getSingleLoginConfig() {
                        org.netbeans.modules.j2ee.dd.api.web.LoginConfig[] values = getLoginConfig();
                        if (values==null || values.length==0) return null;
                        else return values[0];
                    }
                    public void setDistributable(boolean value) {
                        if (value) setDistributable(new EmptyType[]{new EmptyType()});
                        else setDistributable(new EmptyType[]{});
                    }
                    public boolean isDistributable() {
                        EmptyType[] values = getDistributable();
                        if (values==null || values.length==0) return false;
                        else return true;
                    }
                    public void setLocaleEncodingMappingList(org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMappingList value) {
                        if (value==null) setLocaleEncodingMappingList(new org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMappingList[]{});
                        else setLocaleEncodingMappingList(new org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMappingList[]{value});
                    }
                    public org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMappingList getSingleLocaleEncodingMappingList() {
                        org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMappingList[] values = getLocaleEncodingMappingList();
                        if (values==null || values.length==0) return null;
                        else return values[0];
                    }
                    public org.netbeans.modules.j2ee.dd.api.web.AbsoluteOrdering newAbsoluteOrdering() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                        throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException("web-fragment "+VERSION_3_0);
                    }
                    public void setAbsoluteOrdering(org.netbeans.modules.j2ee.dd.api.web.AbsoluteOrdering[] value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                        throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException("web-fragment "+VERSION_3_0);
                    }
                    public org.netbeans.modules.j2ee.dd.api.web.AbsoluteOrdering[] getAbsoluteOrdering() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                        throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException("web-fragment "+VERSION_3_0);
                    }
            
	public void validate() throws org.netbeans.modules.schema2beans.ValidateException {
		boolean restrictionFailure = false;
		boolean restrictionPassed = false;
		// Validating property version
		if (getVersion() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getVersion() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "version", this);	// NOI18N
		}
		final java.lang.String[] enumRestrictionVersion = {"3.0"};
		restrictionFailure = true;
		for (int _index2 = 0; _index2 < enumRestrictionVersion.length; 
			++_index2) {
			if (enumRestrictionVersion[_index2].equals(getVersion())) {
				restrictionFailure = false;
				break;
			}
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getVersion() enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "version", this);	// NOI18N
		}
		// Validating property id
		if (getId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "id", this);	// NOI18N
			}
		}
		// Validating property metadataComplete
		// Validating property name
		for (int _index = 0; _index < sizeName(); ++_index) {
			java.lang.String element = getName(_index);
			if (element != null) {
				{
					boolean patternPassed = false;
					if ((element).matches("($|_|\\p{L})(\\p{L}|\\p{Nd}|_|$)*")) {
						patternPassed = true;
					}
					restrictionFailure = !patternPassed;
				}
				if (restrictionFailure) {
					throw new org.netbeans.modules.schema2beans.ValidateException("element", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "name", this);	// NOI18N
				}
			}
		}
		// Validating property description
		// Validating property descriptionId
		// Validating property descriptionXmlLang
		// Validating property displayName
		for (int _index = 0; _index < sizeDisplayName(); ++_index) {
			java.lang.String element = getDisplayName(_index);
			if (element != null) {
				// has whitespace restriction
				if (restrictionFailure) {
					throw new org.netbeans.modules.schema2beans.ValidateException("element whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "displayName", this);	// NOI18N
				}
			}
		}
		// Validating property displayNameId
		// Validating property displayNameXmlLang
		// Validating property icon
		for (int _index = 0; _index < sizeIcon(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.Icon element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.Icon) getIcon(_index);
			if (element != null) {
				((Icon)element).validate();
			}
		}
		// Validating property distributable
		for (int _index = 0; _index < sizeDistributable(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.EmptyType element = getDistributable(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property contextParam
		for (int _index = 0; _index < sizeContextParam(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.InitParam element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.InitParam) getContextParam(_index);
			if (element != null) {
				((InitParam)element).validate();
			}
		}
		// Validating property filter
		for (int _index = 0; _index < sizeFilter(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.Filter element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.Filter) getFilter(_index);
			if (element != null) {
				((Filter)element).validate();
			}
		}
		// Validating property filterMapping
		for (int _index = 0; _index < sizeFilterMapping(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.FilterMapping element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.FilterMapping) getFilterMapping(_index);
			if (element != null) {
				((FilterMapping)element).validate();
			}
		}
		// Validating property listener
		for (int _index = 0; _index < sizeListener(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.Listener element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.Listener) getListener(_index);
			if (element != null) {
				((Listener)element).validate();
			}
		}
		// Validating property servlet
		for (int _index = 0; _index < sizeServlet(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.Servlet element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.Servlet) getServlet(_index);
			if (element != null) {
				((Servlet)element).validate();
			}
		}
		// Validating property servletMapping
		for (int _index = 0; _index < sizeServletMapping(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.ServletMapping element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.ServletMapping) getServletMapping(_index);
			if (element != null) {
				((ServletMapping)element).validate();
			}
		}
		// Validating property sessionConfig
		for (int _index = 0; _index < sizeSessionConfig(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.SessionConfig element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.SessionConfig) getSessionConfig(_index);
			if (element != null) {
				((SessionConfig)element).validate();
			}
		}
		// Validating property mimeMapping
		for (int _index = 0; _index < sizeMimeMapping(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.MimeMapping element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.MimeMapping) getMimeMapping(_index);
			if (element != null) {
				((MimeMapping)element).validate();
			}
		}
		// Validating property welcomeFileList
		for (int _index = 0; _index < sizeWelcomeFileList(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.WelcomeFileList element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.WelcomeFileList) getWelcomeFileList(_index);
			if (element != null) {
				((WelcomeFileList)element).validate();
			}
		}
		// Validating property errorPage
		for (int _index = 0; _index < sizeErrorPage(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.ErrorPage element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.ErrorPage) getErrorPage(_index);
			if (element != null) {
				((ErrorPage)element).validate();
			}
		}
		// Validating property jspConfig
		for (int _index = 0; _index < sizeJspConfig(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.JspConfig element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.JspConfig) getJspConfig(_index);
			if (element != null) {
				((JspConfig)element).validate();
			}
		}
		// Validating property securityConstraint
		for (int _index = 0; _index < sizeSecurityConstraint(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.SecurityConstraint element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.SecurityConstraint) getSecurityConstraint(_index);
			if (element != null) {
				((SecurityConstraint)element).validate();
			}
		}
		// Validating property loginConfig
		for (int _index = 0; _index < sizeLoginConfig(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.LoginConfig element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.LoginConfig) getLoginConfig(_index);
			if (element != null) {
				((LoginConfig)element).validate();
			}
		}
		// Validating property securityRole
		for (int _index = 0; _index < sizeSecurityRole(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.SecurityRole element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.SecurityRole) getSecurityRole(_index);
			if (element != null) {
				((SecurityRole)element).validate();
			}
		}
		// Validating property envEntry
		for (int _index = 0; _index < sizeEnvEntry(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.EnvEntry element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.EnvEntry) getEnvEntry(_index);
			if (element != null) {
				((EnvEntry)element).validate();
			}
		}
		// Validating property ejbRef
		for (int _index = 0; _index < sizeEjbRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.EjbRef element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.EjbRef) getEjbRef(_index);
			if (element != null) {
				((EjbRef)element).validate();
			}
		}
		// Validating property ejbLocalRef
		for (int _index = 0; _index < sizeEjbLocalRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.EjbLocalRef element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.EjbLocalRef) getEjbLocalRef(_index);
			if (element != null) {
				((EjbLocalRef)element).validate();
			}
		}
		// Validating property serviceRef
		for (int _index = 0; _index < sizeServiceRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.ServiceRef element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.ServiceRef) getServiceRef(_index);
			if (element != null) {
				((ServiceRef)element).validate();
			}
		}
		// Validating property resourceRef
		for (int _index = 0; _index < sizeResourceRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.ResourceRef element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.ResourceRef) getResourceRef(_index);
			if (element != null) {
				((ResourceRef)element).validate();
			}
		}
		// Validating property resourceEnvRef
		for (int _index = 0; _index < sizeResourceEnvRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.ResourceEnvRef element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.ResourceEnvRef) getResourceEnvRef(_index);
			if (element != null) {
				((ResourceEnvRef)element).validate();
			}
		}
		// Validating property messageDestinationRef
		for (int _index = 0; _index < sizeMessageDestinationRef(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.MessageDestinationRef element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.MessageDestinationRef) getMessageDestinationRef(_index);
			if (element != null) {
				((MessageDestinationRef)element).validate();
			}
		}
		// Validating property persistenceContextRef
		for (int _index = 0; _index < sizePersistenceContextRef(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.PersistenceContextRefType element = getPersistenceContextRef(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property persistenceUnitRef
		for (int _index = 0; _index < sizePersistenceUnitRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.PersistenceUnitRefType element = getPersistenceUnitRef(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property postConstruct
		for (int _index = 0; _index < sizePostConstruct(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.LifecycleCallbackType element = getPostConstruct(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property preDestroy
		for (int _index = 0; _index < sizePreDestroy(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.LifecycleCallbackType element = getPreDestroy(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property dataSource
		for (int _index = 0; _index < sizeDataSource(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.DataSourceType element = getDataSource(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property messageDestination
		for (int _index = 0; _index < sizeMessageDestination(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.MessageDestination element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.MessageDestination) getMessageDestination(_index);
			if (element != null) {
				((MessageDestination)element).validate();
			}
		}
		// Validating property localeEncodingMappingList
		for (int _index = 0; _index < sizeLocaleEncodingMappingList(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.LocaleEncodingMappingList element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.LocaleEncodingMappingList) getLocaleEncodingMappingList(_index);
			if (element != null) {
				((LocaleEncodingMappingList)element).validate();
			}
		}
		// Validating property ordering
		for (int _index = 0; _index < sizeOrdering(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.RelativeOrdering element = (org.netbeans.modules.j2ee.dd.impl.web.model_3_0_frag.RelativeOrdering) getOrdering(_index);
			if (element != null) {
				((RelativeOrdering)element).validate();
			}
		}
	}

	// Special serializer: output XML as serialization
	private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException{
		out.defaultWriteObject();
		final int MAX_SIZE = 0XFFFF;
		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try{
			write(baos, SERIALIZATION_HELPER_CHARSET);
			final byte [] array = baos.toByteArray();
			final int numStrings = array.length / MAX_SIZE;
			final int leftover = array.length % MAX_SIZE;
			out.writeInt(numStrings + (0 == leftover ? 0 : 1));
			out.writeInt(MAX_SIZE);
			int offset = 0;
			for (int i = 0; i < numStrings; i++){
				out.writeUTF(new String(array, offset, MAX_SIZE, SERIALIZATION_HELPER_CHARSET));
				offset += MAX_SIZE;
			}
			if (leftover > 0){
				final int count = array.length - offset;
				out.writeUTF(new String(array, offset, count, SERIALIZATION_HELPER_CHARSET));
			}
		}
		catch (Schema2BeansException ex){
			throw new Schema2BeansRuntimeException(ex);
		}
	}
	// Special deserializer: read XML as deserialization
	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException{
		try{
			in.defaultReadObject();
			init(comparators, runtimeVersion);
			// init(comparators, new GenBeans.Version(1, 0, 8))
			final int numStrings = in.readInt();
			final int max_size = in.readInt();
			final StringBuilder sb = new StringBuilder(numStrings * max_size);
			for (int i = 0; i < numStrings; i++){
				sb.append(in.readUTF());
			}
			ByteArrayInputStream bais = new ByteArrayInputStream(sb.toString().getBytes(SERIALIZATION_HELPER_CHARSET));
			Document doc = GraphManager.createXmlDocument(bais, false);
			initOptions(Common.NO_DEFAULT_VALUES);
			initFromNode(doc, Common.NO_DEFAULT_VALUES);
		}
		catch (Schema2BeansException e){
			throw new RuntimeException(e);
		}
	}

	public void _setSchemaLocation(String location) {
		if (beanProp().getAttrProp("xsi:schemaLocation", true) == null) {
			createAttribute("xmlns:xsi", "xmlns:xsi", AttrProp.CDATA | AttrProp.IMPLIED, null, "http://www.w3.org/2001/XMLSchema-instance");
			setAttributeValue("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
			createAttribute("xsi:schemaLocation", "xsi:schemaLocation", AttrProp.CDATA | AttrProp.IMPLIED, null, location);
		}
		setAttributeValue("xsi:schemaLocation", location);
	}

	public String _getSchemaLocation() {
		if (beanProp().getAttrProp("xsi:schemaLocation", true) == null) {
			createAttribute("xmlns:xsi", "xmlns:xsi", AttrProp.CDATA | AttrProp.IMPLIED, null, "http://www.w3.org/2001/XMLSchema-instance");
			setAttributeValue("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
			createAttribute("xsi:schemaLocation", "xsi:schemaLocation", AttrProp.CDATA | AttrProp.IMPLIED, null, null);
		}
		return getAttributeValue("xsi:schemaLocation");
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Name["+this.sizeName()+"]");	// NOI18N
		for(int i=0; i<this.sizeName(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getName(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(NAME, i, str, indent);
		}

		str.append(indent);
		str.append("Description["+this.sizeDescription()+"]");	// NOI18N
		for(int i=0; i<this.sizeDescription(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getDescription(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(DESCRIPTION, i, str, indent);
		}

		str.append(indent);
		str.append("DisplayName["+this.sizeDisplayName()+"]");	// NOI18N
		for(int i=0; i<this.sizeDisplayName(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getDisplayName(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(DISPLAY_NAME, i, str, indent);
		}

		str.append(indent);
		str.append("Icon["+this.sizeIcon()+"]");	// NOI18N
		for(int i=0; i<this.sizeIcon(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getIcon(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(ICON, i, str, indent);
		}

		str.append(indent);
		str.append("Distributable["+this.sizeDistributable()+"]");	// NOI18N
		for(int i=0; i<this.sizeDistributable(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getDistributable(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(DISTRIBUTABLE, i, str, indent);
		}

		str.append(indent);
		str.append("ContextParam["+this.sizeContextParam()+"]");	// NOI18N
		for(int i=0; i<this.sizeContextParam(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getContextParam(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(CONTEXT_PARAM, i, str, indent);
		}

		str.append(indent);
		str.append("Filter["+this.sizeFilter()+"]");	// NOI18N
		for(int i=0; i<this.sizeFilter(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getFilter(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(FILTER, i, str, indent);
		}

		str.append(indent);
		str.append("FilterMapping["+this.sizeFilterMapping()+"]");	// NOI18N
		for(int i=0; i<this.sizeFilterMapping(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getFilterMapping(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(FILTER_MAPPING, i, str, indent);
		}

		str.append(indent);
		str.append("Listener["+this.sizeListener()+"]");	// NOI18N
		for(int i=0; i<this.sizeListener(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getListener(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(LISTENER, i, str, indent);
		}

		str.append(indent);
		str.append("Servlet["+this.sizeServlet()+"]");	// NOI18N
		for(int i=0; i<this.sizeServlet(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getServlet(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(SERVLET, i, str, indent);
		}

		str.append(indent);
		str.append("ServletMapping["+this.sizeServletMapping()+"]");	// NOI18N
		for(int i=0; i<this.sizeServletMapping(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getServletMapping(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(SERVLET_MAPPING, i, str, indent);
		}

		str.append(indent);
		str.append("SessionConfig["+this.sizeSessionConfig()+"]");	// NOI18N
		for(int i=0; i<this.sizeSessionConfig(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getSessionConfig(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(SESSION_CONFIG, i, str, indent);
		}

		str.append(indent);
		str.append("MimeMapping["+this.sizeMimeMapping()+"]");	// NOI18N
		for(int i=0; i<this.sizeMimeMapping(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getMimeMapping(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(MIME_MAPPING, i, str, indent);
		}

		str.append(indent);
		str.append("WelcomeFileList["+this.sizeWelcomeFileList()+"]");	// NOI18N
		for(int i=0; i<this.sizeWelcomeFileList(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getWelcomeFileList(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(WELCOME_FILE_LIST, i, str, indent);
		}

		str.append(indent);
		str.append("ErrorPage["+this.sizeErrorPage()+"]");	// NOI18N
		for(int i=0; i<this.sizeErrorPage(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getErrorPage(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(ERROR_PAGE, i, str, indent);
		}

		str.append(indent);
		str.append("JspConfig["+this.sizeJspConfig()+"]");	// NOI18N
		for(int i=0; i<this.sizeJspConfig(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getJspConfig(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(JSP_CONFIG, i, str, indent);
		}

		str.append(indent);
		str.append("SecurityConstraint["+this.sizeSecurityConstraint()+"]");	// NOI18N
		for(int i=0; i<this.sizeSecurityConstraint(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getSecurityConstraint(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(SECURITY_CONSTRAINT, i, str, indent);
		}

		str.append(indent);
		str.append("LoginConfig["+this.sizeLoginConfig()+"]");	// NOI18N
		for(int i=0; i<this.sizeLoginConfig(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getLoginConfig(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(LOGIN_CONFIG, i, str, indent);
		}

		str.append(indent);
		str.append("SecurityRole["+this.sizeSecurityRole()+"]");	// NOI18N
		for(int i=0; i<this.sizeSecurityRole(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getSecurityRole(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(SECURITY_ROLE, i, str, indent);
		}

		str.append(indent);
		str.append("EnvEntry["+this.sizeEnvEntry()+"]");	// NOI18N
		for(int i=0; i<this.sizeEnvEntry(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getEnvEntry(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(ENV_ENTRY, i, str, indent);
		}

		str.append(indent);
		str.append("EjbRef["+this.sizeEjbRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeEjbRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getEjbRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(EJB_REF, i, str, indent);
		}

		str.append(indent);
		str.append("EjbLocalRef["+this.sizeEjbLocalRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeEjbLocalRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getEjbLocalRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(EJB_LOCAL_REF, i, str, indent);
		}

		str.append(indent);
		str.append("ServiceRef["+this.sizeServiceRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeServiceRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getServiceRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(SERVICE_REF, i, str, indent);
		}

		str.append(indent);
		str.append("ResourceRef["+this.sizeResourceRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeResourceRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getResourceRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(RESOURCE_REF, i, str, indent);
		}

		str.append(indent);
		str.append("ResourceEnvRef["+this.sizeResourceEnvRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeResourceEnvRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getResourceEnvRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(RESOURCE_ENV_REF, i, str, indent);
		}

		str.append(indent);
		str.append("MessageDestinationRef["+this.sizeMessageDestinationRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeMessageDestinationRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getMessageDestinationRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(MESSAGE_DESTINATION_REF, i, str, indent);
		}

		str.append(indent);
		str.append("PersistenceContextRef["+this.sizePersistenceContextRef()+"]");	// NOI18N
		for(int i=0; i<this.sizePersistenceContextRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getPersistenceContextRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(PERSISTENCE_CONTEXT_REF, i, str, indent);
		}

		str.append(indent);
		str.append("PersistenceUnitRef["+this.sizePersistenceUnitRef()+"]");	// NOI18N
		for(int i=0; i<this.sizePersistenceUnitRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getPersistenceUnitRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(PERSISTENCE_UNIT_REF, i, str, indent);
		}

		str.append(indent);
		str.append("PostConstruct["+this.sizePostConstruct()+"]");	// NOI18N
		for(int i=0; i<this.sizePostConstruct(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getPostConstruct(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(POST_CONSTRUCT, i, str, indent);
		}

		str.append(indent);
		str.append("PreDestroy["+this.sizePreDestroy()+"]");	// NOI18N
		for(int i=0; i<this.sizePreDestroy(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getPreDestroy(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(PRE_DESTROY, i, str, indent);
		}

		str.append(indent);
		str.append("DataSource["+this.sizeDataSource()+"]");	// NOI18N
		for(int i=0; i<this.sizeDataSource(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getDataSource(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(DATA_SOURCE, i, str, indent);
		}

		str.append(indent);
		str.append("MessageDestination["+this.sizeMessageDestination()+"]");	// NOI18N
		for(int i=0; i<this.sizeMessageDestination(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getMessageDestination(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(MESSAGE_DESTINATION, i, str, indent);
		}

		str.append(indent);
		str.append("LocaleEncodingMappingList["+this.sizeLocaleEncodingMappingList()+"]");	// NOI18N
		for(int i=0; i<this.sizeLocaleEncodingMappingList(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getLocaleEncodingMappingList(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(LOCALE_ENCODING_MAPPING_LIST, i, str, indent);
		}

		str.append(indent);
		str.append("Ordering["+this.sizeOrdering()+"]");	// NOI18N
		for(int i=0; i<this.sizeOrdering(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getOrdering(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(ORDERING, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("WebFragment\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N


/*
		The following schema file has been used for generation:

<?xml version="1.0" encoding="UTF-8"?>
<xsd:schema xmlns="http://www.w3.org/2001/XMLSchema"
	    targetNamespace="http://java.sun.com/xml/ns/javaee"
	    xmlns:javaee="http://java.sun.com/xml/ns/javaee"
	    xmlns:xsd="http://www.w3.org/2001/XMLSchema"
	    elementFormDefault="qualified"
	    attributeFormDefault="unqualified"
	    version="3.0">
  <xsd:annotation>
    <xsd:documentation>
      @(#)web-fragment_3_0.xsds
    </xsd:documentation>
  </xsd:annotation>

  <xsd:annotation>
    <xsd:documentation>

      DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.

      Copyright 2003-2010 Oracle and/or its affiliates. All rights reserved.

Oracle and Java are registered trademarks of Oracle and/or its affiliates.
Other names may be trademarks of their respective owners.

      The contents of this file are subject to the terms of either the
      GNU General Public License Version 2 only ("GPL") or the Common
      Development and Distribution License("CDDL") (collectively, the
      "License").  You may not use this file except in compliance with
      the License. You can obtain a copy of the License at
      https://glassfish.dev.java.net/public/CDDL+GPL.html or
      glassfish/bootstrap/legal/LICENSE.txt.  See the License for the
      specific language governing permissions and limitations under the
      License.

      When distributing the software, include this License Header
      Notice in each file and include the License file at
      glassfish/bootstrap/legal/LICENSE.txt.  Sun designates this
      particular file as subject to the "Classpath" exception as
      provided by Sun in the GPL Version 2 section of the License file
      that accompanied this code.  If applicable, add the following
      below the License Header, with the fields enclosed by brackets []
      replaced by your own identifying information:
      "Portions Copyrighted [year] [name of copyright owner]"

      Contributor(s):

      If you wish your version of this file to be governed by only the
      CDDL or only the GPL Version 2, indicate your decision by adding
      "[Contributor] elects to include this software in this
      distribution under the [CDDL or GPL Version 2] license."  If you
      don't indicate a single choice of license, a recipient has the
      option to distribute your version of this file under either the
      CDDL, the GPL Version 2 or to extend the choice of license to its
      licensees as provided above.  However, if you add GPL Version 2
      code and therefore, elected the GPL Version 2 license, then the
      option applies only if the new code is made subject to such
      option by the copyright holder.

    </xsd:documentation>
  </xsd:annotation>

  <xsd:annotation>
    <xsd:documentation>
      <![CDATA[

	This is the XML Schema for the Servlet 3.0 deployment descriptor.
	The deployment descriptor must be named "META-INF/web-fragment.xml" in the
	web fragment's jar file.  All Servlet deployment descriptors
	must indicate the web fragment schema by using the Java EE
	namespace:

	http://java.sun.com/xml/ns/javaee

	and by indicating the version of the schema by
	using the version element as shown below:

	    <web-fragment xmlns="http://java.sun.com/xml/ns/javaee"
	      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	      xsi:schemaLocation="..."
	      version="3.0">
	      ...
	    </web-fragment>

	The instance documents may indicate the published version of
	the schema using the xsi:schemaLocation attribute for Java EE
	namespace with the following location:

	http://java.sun.com/xml/ns/javaee/web-fragment_3_0.xsd

	]]>
    </xsd:documentation>
  </xsd:annotation>

  <xsd:annotation>
    <xsd:documentation>

      The following conventions apply to all Java EE
      deployment descriptor elements unless indicated otherwise.

      - In elements that specify a pathname to a file within the
	same JAR file, relative filenames (i.e., those not
	starting with "/") are considered relative to the root of
	the JAR file's namespace.  Absolute filenames (i.e., those
	starting with "/") also specify names in the root of the
	JAR file's namespace.  In general, relative names are
	preferred.  The exception is .war files where absolute
	names are preferred for consistency with the Servlet API.

    </xsd:documentation>
  </xsd:annotation>

  <xsd:include schemaLocation="web-common_3_0.xsd"/>


<!-- **************************************************** -->

  <xsd:element name="web-fragment" type="javaee:web-fragmentType">
    <xsd:annotation>
      <xsd:documentation>

	The web-fragment element is the root of the deployment
	descriptor for a web fragment.  Note that the sub-elements
	of this element can be in the arbitrary order. Because of
	that, the multiplicity of the elements of distributable,
	session-config, welcome-file-list, jsp-config, login-config,
	and locale-encoding-mapping-list was changed from "?" to "*"
	in this schema.  However, the deployment descriptor instance
	file must not contain multiple elements of session-config,
	jsp-config, and login-config. When there are multiple elements of
	welcome-file-list or locale-encoding-mapping-list, the container
	must concatenate the element contents.  The multiple occurence
	of the element distributable is redundant and the container
	treats that case exactly in the same way when there is only
	one distributable.

      </xsd:documentation>
    </xsd:annotation>

    <xsd:unique name="web-common-servlet-name-uniqueness">
      <xsd:annotation>
	<xsd:documentation>

	  The servlet element contains the name of a servlet.
	  The name must be unique within the web application.

	</xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:servlet"/>
      <xsd:field    xpath="javaee:servlet-name"/>
    </xsd:unique>

    <xsd:unique name="web-common-filter-name-uniqueness">
      <xsd:annotation>
	<xsd:documentation>

	  The filter element contains the name of a filter.
	  The name must be unique within the web application.

	</xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:filter"/>
      <xsd:field    xpath="javaee:filter-name"/>
    </xsd:unique>

    <xsd:unique name="web-common-ejb-local-ref-name-uniqueness">
      <xsd:annotation>
	<xsd:documentation>

	  The ejb-local-ref-name element contains the name of an EJB
	  reference. The EJB reference is an entry in the web
	  application's environment and is relative to the
	  java:comp/env context.  The name must be unique within
	  the web application.

	  It is recommended that name is prefixed with "ejb/".

	</xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:ejb-local-ref"/>
      <xsd:field    xpath="javaee:ejb-ref-name"/>
    </xsd:unique>

    <xsd:unique name="web-common-ejb-ref-name-uniqueness">
      <xsd:annotation>
	<xsd:documentation>

	  The ejb-ref-name element contains the name of an EJB
	  reference. The EJB reference is an entry in the web
	  application's environment and is relative to the
	  java:comp/env context.  The name must be unique within
	  the web application.

	  It is recommended that name is prefixed with "ejb/".

	</xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:ejb-ref"/>
      <xsd:field    xpath="javaee:ejb-ref-name"/>
    </xsd:unique>

    <xsd:unique name="web-common-resource-env-ref-uniqueness">
      <xsd:annotation>
	<xsd:documentation>

	  The resource-env-ref-name element specifies the name of
	  a resource environment reference; its value is the
	  environment entry name used in the web application code.
	  The name is a JNDI name relative to the java:comp/env
	  context and must be unique within a web application.

	</xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:resource-env-ref"/>
      <xsd:field    xpath="javaee:resource-env-ref-name"/>
    </xsd:unique>

    <xsd:unique name="web-common-message-destination-ref-uniqueness">
      <xsd:annotation>
	<xsd:documentation>

	  The message-destination-ref-name element specifies the name of
	  a message destination reference; its value is the
	  environment entry name used in the web application code.
	  The name is a JNDI name relative to the java:comp/env
	  context and must be unique within a web application.

	</xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:message-destination-ref"/>
      <xsd:field    xpath="javaee:message-destination-ref-name"/>
    </xsd:unique>

    <xsd:unique name="web-common-res-ref-name-uniqueness">
      <xsd:annotation>
	<xsd:documentation>

	  The res-ref-name element specifies the name of a
	  resource manager connection factory reference.  The name
	  is a JNDI name relative to the java:comp/env context.
	  The name must be unique within a web application.

	</xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:resource-ref"/>
      <xsd:field    xpath="javaee:res-ref-name"/>
    </xsd:unique>

    <xsd:unique name="web-common-env-entry-name-uniqueness">
      <xsd:annotation>
	<xsd:documentation>

	  The env-entry-name element contains the name of a web
	  application's environment entry.  The name is a JNDI
	  name relative to the java:comp/env context.  The name
	  must be unique within a web application.

	</xsd:documentation>
      </xsd:annotation>

      <xsd:selector xpath="javaee:env-entry"/>
      <xsd:field    xpath="javaee:env-entry-name"/>
    </xsd:unique>

    <xsd:key name="web-common-role-name-key">
      <xsd:annotation>
	<xsd:documentation>

	  A role-name-key is specified to allow the references
	  from the security-role-refs.

	</xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:security-role"/>
      <xsd:field    xpath="javaee:role-name"/>
    </xsd:key>

    <xsd:keyref name="web-common-role-name-references"
		refer="javaee:web-common-role-name-key">
      <xsd:annotation>
	<xsd:documentation>

	  The keyref indicates the references from
	  security-role-ref to a specified role-name.

	</xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:servlet/javaee:security-role-ref"/>
      <xsd:field    xpath="javaee:role-link"/>
    </xsd:keyref>
  </xsd:element>

</xsd:schema>


*/
