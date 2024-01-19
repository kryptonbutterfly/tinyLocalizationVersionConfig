module kryptonbutterfly.LocalizationVersionConfig
{
	exports kryptonbutterfly.i18n.config;
	
	opens kryptonbutterfly.i18n.config to kryptonbutterfly.xmlConfig4J;
	
	requires kryptonbutterfly.xmlConfig4J;
	requires java.xml;
}