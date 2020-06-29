package concurrent;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/6/23 8:43
 */
@ThreadSafe
public class CachedFactorizer implements Servlet {
    @GuardedBy("this")
    private BigInteger lastNumber;
    @GuardedBy("this")
    private BigInteger[] lastFactors;
    @GuardedBy("this")
    private long hits;
    @GuardedBy("this")
    private long cachedHits;

    public synchronized long getHits() {
        return hits;
    }
    public synchronized double getCacheHitRatio(){
        return (double) cachedHits/(double) hits;
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        BigInteger i = (BigInteger) servletRequest.getAttribute("key");
        BigInteger[] factors = null;
        synchronized (this){
            ++hits;
            if (i.equals(lastNumber)){
                ++cachedHits;
                factors = lastFactors.clone();
            }
        }
        if (factors == null){
            synchronized (this){
                lastNumber = i;
                lastFactors = factors.clone();
            }

        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
