package org.terifan.httpclient;


@FunctionalInterface
public interface AfterExecuteAction
{
	void execute(HttpRequest aRequest, HttpResponse aResponse);
}
