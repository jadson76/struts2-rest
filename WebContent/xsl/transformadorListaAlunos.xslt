<?xml version='1.0' encoding='utf-8' ?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:a="http://meunamespace.com"  xmlns:xlink="http://www.w3.org/1999/xlink" version="1.0">

<xsl:output method="xml" indent="yes" />
  <xsl:template name="templateRaiz" match="result/alunos">
    <a:alunos>
      <xsl:for-each select="*">
        <xsl:call-template name="templateAluno" />
      </xsl:for-each>
    </a:alunos>
  </xsl:template>

  <xsl:template name="templateAluno" match="item">
    <aluno xlink:href="http://localhost:8080/WSStruts2/alunos/{id}">
      <nome>
        <xsl:value-of select="nome" />
      </nome>
      <id>
        <xsl:value-of select="id" />
      </id>
    </aluno>
  </xsl:template>
</xsl:stylesheet>