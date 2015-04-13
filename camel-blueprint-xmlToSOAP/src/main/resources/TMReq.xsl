<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output omit-xml-declaration="yes" indent="no" />
	<xsl:strip-space elements="*" />
	<xsl:template match="*">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:xsd="http://www.w3.org/2001/XMLSchema">
			<soap:Body>
				
					<reqxml>
						<xsl:text disable-output-escaping="yes">&lt;![CDATA[</xsl:text>
						    <person>
						    <xsl:copy-of select="*"/>
						    </person>
						<xsl:text disable-output-escaping="yes">]]&gt;</xsl:text>
					</reqxml>
			
			</soap:Body>
		</soap:Envelope>
	</xsl:template>
</xsl:stylesheet>