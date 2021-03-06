package org.codehaus.groovy.grails.web.pages.ext.jsp

import javax.servlet.Servlet
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.jsp.JspEngineInfo
import javax.servlet.jsp.JspFactory
import javax.servlet.jsp.PageContext

/**
 * @author Graeme Rocher
 * @since 1.0
 */
abstract class GroovyPagesJspFactory extends JspFactory {

    PageContext getPageContext(Servlet servlet, ServletRequest servletRequest, ServletResponse servletResponse, String s, boolean b, int i, boolean b1) {
         throw new UnsupportedOperationException()
    }

    void releasePageContext(PageContext pageContext) {
         throw new UnsupportedOperationException()
    }

    JspEngineInfo getEngineInfo() {
        return { getSpecificationVersion() } as JspEngineInfo
    }

    protected abstract String getSpecificationVersion()
}
