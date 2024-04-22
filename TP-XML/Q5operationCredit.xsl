<xsl:stylesheet version="1.0"
 xmlns:xsl="http://www.w3.org/1997/xsl/transform">

<xsl:template match="/">
  <html>
    <head>
      <title>Opérations de crédit</title>
    </head>
    <body>
      <h1>Opérations de crédit du relevé bancaire (RIB : <xsl:value-of select="@RIB"/>)</h1>
      <table border="1">
        <thead>
          <tr>
            <th>Date</th>
            <th>Montant</th>
            <th>Description</th>
          </tr>
        </thead>
        <tbody>
          <xsl:for-each select="operations/operation[@type='CREDIT']">
            <tr>
              <td><xsl:value-of select="date"/></td>
              <td><xsl:value-of select="montant"/>€</td>
              <td><xsl:value-of select="description"/></td>
            </tr>
          </xsl:for-each>
        </tbody>
      </table>
    </body>
  </html>
</xsl:stylesheet>
