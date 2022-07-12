module de.tinycodecrank.LocalizationVersionConfig
{
	exports de.tinycodecrank.i18n.config;
	
	opens de.tinycodecrank.i18n.config to de.tinycodecrank.xmlConfig4J;
	
	requires de.tinycodecrank.xmlConfig4J;
	requires java.xml;
}