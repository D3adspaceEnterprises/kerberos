/*
 * Copyright (c) 2017 D3adspace
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.d3adspace.kerberos.config;

/**
 * @author Felix 'SasukeKawaii' Klauke
 */
public class KerberosConfig {
	
	private String databaseHost;
	private String databasePort;
	private String databaseName;
	private String databaseUser;
	private String databasePassword;
	
	KerberosConfig(String databaseHost, String databasePort, String databaseName,
		String databaseUser, String databasePassword) {
		this.databaseHost = databaseHost;
		this.databasePort = databasePort;
		this.databaseName = databaseName;
		this.databaseUser = databaseUser;
		this.databasePassword = databasePassword;
	}
	
	public static KerberosConfigBuilder newBuilder() {
		return new KerberosConfigBuilder();
	}
	
	public String getDatabaseHost() {
		return databaseHost;
	}
	
	public String getDatabaseName() {
		return databaseName;
	}
	
	public String getDatabasePassword() {
		return databasePassword;
	}
	
	public String getDatabasePort() {
		return databasePort;
	}
	
	public String getDatabaseUser() {
		return databaseUser;
	}
}
