package org.zkoss.zkforge.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "zk")
@Validated
public class ZkProperties {

	private String updateUri = "/zkau";
	private boolean websocketsEnabled = true; //ZK-EE only
	private boolean servlet3PushEnabled = true; //ZK-EE only

	private boolean zulViewResolverEnabled = true;
	private String zulViewResolverPrefix = "";
	private String zulViewResolverSuffix = ".zul";

	private String richletFilterMapping;

	public String getUpdateUri() {
		return updateUri;
	}

	public void setUpdateUri(String updateUri) {
		this.updateUri = updateUri;
	}

	public boolean isWebsocketsEnabled() {
		return websocketsEnabled;
	}

	public void setWebsocketsEnabled(boolean websocketsEnabled) {
		this.websocketsEnabled = websocketsEnabled;
	}

	public boolean isServlet3PushEnabled() {
		return servlet3PushEnabled;
	}

	public void setServlet3PushEnabled(boolean servlet3PushEnabled) {
		this.servlet3PushEnabled = servlet3PushEnabled;
	}

	public boolean isZulViewResolverEnabled() {
		return zulViewResolverEnabled;
	}

	public void setZulViewResolverEnabled(boolean zulViewResolverEnabled) {
		this.zulViewResolverEnabled = zulViewResolverEnabled;
	}

	public String getZulViewResolverPrefix() {
		return zulViewResolverPrefix;
	}

	public void setZulViewResolverPrefix(String zulViewResolverPrefix) {
		this.zulViewResolverPrefix = zulViewResolverPrefix;
	}

	public String getZulViewResolverSuffix() {
		return zulViewResolverSuffix;
	}

	public void setZulViewResolverSuffix(String zulViewResolverSuffix) {
		this.zulViewResolverSuffix = zulViewResolverSuffix;
	}

	public String getRichletFilterMapping() {
		return richletFilterMapping;
	}

	public void setRichletFilterMapping(String richletFilterMapping) {
		this.richletFilterMapping = richletFilterMapping;
	}
}
