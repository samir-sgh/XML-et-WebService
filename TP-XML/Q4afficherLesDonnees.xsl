<xsl:stylesheet version="1.0"
 xmlns:xsl="http://www.w3.org/1997/xsl/transform">

<xsl:template match="/">
  <html>
    <head>
      <title>Relevé bancaire</title>
    </head>
    <body>
      <h1>Relevé bancaire (RIB : <xsl:value-of select="@RIB"/>)</h1>
      <p>Date relevé : <xsl:value-of select="dateReleve"/></p>
      <p>Solde : <xsl:value-of select="solde"/>€</p>
      <h2>Opérations</h2>
      <table border="1">
        <thead>
          <tr>
            <th>Type</th>
            <th>Date</th>
            <th>Montant</th>
            <th>Description</th>
          </tr>
        </thead>
        <tbody>
          <xsl:for-each select="operations/operation">
            <tr>
              <td><xsl:value-of select="type"/></td>
              <td><xsl:value-of select="date"/></td>
              <td>
                <xsl:if test="@type = 'DEBIT'">
                  - <xsl:value-of select="montant"/>€
                </xsl:if>
                <xsl:if test="@type = 'CREDIT'">
                  <xsl:value-of select="montant"/>€
                </xsl:if>
              </td>
              <td><xsl:value-of select="description"/></td>
            </tr>
          </xsl:for-each>
        </tbody>
      </table>
      <p>Total Débit : <xsl:variable name="debitTotal" select="sum(operations/operation[@type='DEBIT']/montant)"/>€<xsl:value-of select="$debitTotal"/></p>
      <p>Total Crédit : <xsl:variable name="creditTotal" select="sum(operations/operation[@type='CREDIT']/montant)"/>€<xsl:value-of select="$creditTotal"/></p>
    </body>
  </html>
</xsl:stylesheet>
