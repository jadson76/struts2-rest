<?xml version='1.0' encoding='utf-8' ?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

<xsl:output method="xml" indent="yes" />
<xsl:template match="result/aluno">
    <a:aluno xmlns:a="http://meunamespace.com"  xmlns:xlink="http://www.w3.org/1999/xlink">
        <nome>
            <xsl:value-of select="nome" />
        </nome>
        <email>
            <xsl:value-of select="email" />
        </email>
        <idade>
            <xsl:value-of select="idade" />
        </idade>
        <disciplinas>
            <xsl:for-each select="disciplinas/*">
                <disciplina>
                    <nome>
                        <xsl:value-of select="nome" />
                    </nome>
                    <detalhes xlink:href="http://localhost:8080/WSStruts2/disciplina/{id}" />
                </disciplina>
            </xsl:for-each>
        </disciplinas>
    </a:aluno>
</xsl:template>
</xsl:stylesheet>