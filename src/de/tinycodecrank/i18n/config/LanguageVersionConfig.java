package de.tinycodecrank.i18n.config;

import java.util.HashMap;

import de.tinycodecrank.xmlConfig4J.StreamConfig;
import de.tinycodecrank.xmlConfig4J.annotations.Value;

public class LanguageVersionConfig extends StreamConfig
{
	public static final String FILE_NAME = "lang_versions.xml";
	
	@Value
	public HashMap<String, Integer> languages = new HashMap<>();
}