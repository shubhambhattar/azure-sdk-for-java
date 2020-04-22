// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import java.time.OffsetDateTime;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in JobStepExecutions. */
public final class JobStepExecutionsInner {
    /** The proxy service used to perform REST calls. */
    private final JobStepExecutionsService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of JobStepExecutionsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    JobStepExecutionsInner(SqlManagementClientImpl client) {
        this.service =
            RestProxy.create(JobStepExecutionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientJobStepExecutions to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientJ")
    private interface JobStepExecutionsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/servers/{serverName}/jobAgents/{jobAgentName}/jobs/{jobName}/executions/{jobExecutionId}/steps")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobExecutionListResultInner>> listByJobExecution(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("jobAgentName") String jobAgentName,
            @PathParam("jobName") String jobName,
            @PathParam("jobExecutionId") UUID jobExecutionId,
            @QueryParam("createTimeMin") OffsetDateTime createTimeMin,
            @QueryParam("createTimeMax") OffsetDateTime createTimeMax,
            @QueryParam("endTimeMin") OffsetDateTime endTimeMin,
            @QueryParam("endTimeMax") OffsetDateTime endTimeMax,
            @QueryParam("isActive") Boolean isActive,
            @QueryParam("$skip") Integer skip,
            @QueryParam("$top") Integer top,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/servers/{serverName}/jobAgents/{jobAgentName}/jobs/{jobName}/executions/{jobExecutionId}/steps"
                + "/{stepName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobExecutionInner>> get(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("jobAgentName") String jobAgentName,
            @PathParam("jobName") String jobName,
            @PathParam("jobExecutionId") UUID jobExecutionId,
            @PathParam("stepName") String stepName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<JobExecutionListResultInner>> listByJobExecutionNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Lists the step executions of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The id of the job execution.
     * @param createTimeMin If specified, only job executions created at or after the specified time are included.
     * @param createTimeMax If specified, only job executions created before the specified time are included.
     * @param endTimeMin If specified, only job executions completed at or after the specified time are included.
     * @param endTimeMax If specified, only job executions completed before the specified time are included.
     * @param isActive If specified, only active or only completed job executions are included.
     * @param skip The number of elements in the collection to skip.
     * @param top The number of elements to return from the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<JobExecutionInner>> listByJobExecutionSinglePageAsync(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        OffsetDateTime createTimeMin,
        OffsetDateTime createTimeMax,
        OffsetDateTime endTimeMin,
        OffsetDateTime endTimeMax,
        Boolean isActive,
        Integer skip,
        Integer top) {
        final String apiVersion = "2017-03-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByJobExecution(
                            this.client.getHost(),
                            resourceGroupName,
                            serverName,
                            jobAgentName,
                            jobName,
                            jobExecutionId,
                            createTimeMin,
                            createTimeMax,
                            endTimeMin,
                            endTimeMax,
                            isActive,
                            skip,
                            top,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .<PagedResponse<JobExecutionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists the step executions of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The id of the job execution.
     * @param createTimeMin If specified, only job executions created at or after the specified time are included.
     * @param createTimeMax If specified, only job executions created before the specified time are included.
     * @param endTimeMin If specified, only job executions completed at or after the specified time are included.
     * @param endTimeMax If specified, only job executions completed before the specified time are included.
     * @param isActive If specified, only active or only completed job executions are included.
     * @param skip The number of elements in the collection to skip.
     * @param top The number of elements to return from the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<JobExecutionInner> listByJobExecutionAsync(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        OffsetDateTime createTimeMin,
        OffsetDateTime createTimeMax,
        OffsetDateTime endTimeMin,
        OffsetDateTime endTimeMax,
        Boolean isActive,
        Integer skip,
        Integer top) {
        return new PagedFlux<>(
            () ->
                listByJobExecutionSinglePageAsync(
                    resourceGroupName,
                    serverName,
                    jobAgentName,
                    jobName,
                    jobExecutionId,
                    createTimeMin,
                    createTimeMax,
                    endTimeMin,
                    endTimeMax,
                    isActive,
                    skip,
                    top),
            nextLink -> listByJobExecutionNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the step executions of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The id of the job execution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<JobExecutionInner> listByJobExecutionAsync(
        String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        final OffsetDateTime createTimeMin = null;
        final OffsetDateTime createTimeMax = null;
        final OffsetDateTime endTimeMin = null;
        final OffsetDateTime endTimeMax = null;
        final Boolean isActive = null;
        final Integer skip = null;
        final Integer top = null;
        final Context context = null;
        return new PagedFlux<>(
            () ->
                listByJobExecutionSinglePageAsync(
                    resourceGroupName,
                    serverName,
                    jobAgentName,
                    jobName,
                    jobExecutionId,
                    createTimeMin,
                    createTimeMax,
                    endTimeMin,
                    endTimeMax,
                    isActive,
                    skip,
                    top),
            nextLink -> listByJobExecutionNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the step executions of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The id of the job execution.
     * @param createTimeMin If specified, only job executions created at or after the specified time are included.
     * @param createTimeMax If specified, only job executions created before the specified time are included.
     * @param endTimeMin If specified, only job executions completed at or after the specified time are included.
     * @param endTimeMax If specified, only job executions completed before the specified time are included.
     * @param isActive If specified, only active or only completed job executions are included.
     * @param skip The number of elements in the collection to skip.
     * @param top The number of elements to return from the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<JobExecutionInner> listByJobExecution(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        OffsetDateTime createTimeMin,
        OffsetDateTime createTimeMax,
        OffsetDateTime endTimeMin,
        OffsetDateTime endTimeMax,
        Boolean isActive,
        Integer skip,
        Integer top) {
        return new PagedIterable<>(
            listByJobExecutionAsync(
                resourceGroupName,
                serverName,
                jobAgentName,
                jobName,
                jobExecutionId,
                createTimeMin,
                createTimeMax,
                endTimeMin,
                endTimeMax,
                isActive,
                skip,
                top));
    }

    /**
     * Lists the step executions of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The id of the job execution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<JobExecutionInner> listByJobExecution(
        String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId) {
        final OffsetDateTime createTimeMin = null;
        final OffsetDateTime createTimeMax = null;
        final OffsetDateTime endTimeMin = null;
        final OffsetDateTime endTimeMax = null;
        final Boolean isActive = null;
        final Integer skip = null;
        final Integer top = null;
        final Context context = null;
        return new PagedIterable<>(
            listByJobExecutionAsync(
                resourceGroupName,
                serverName,
                jobAgentName,
                jobName,
                jobExecutionId,
                createTimeMin,
                createTimeMax,
                endTimeMin,
                endTimeMax,
                isActive,
                skip,
                top));
    }

    /**
     * Gets a step execution of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The unique id of the job execution.
     * @param stepName The name of the step.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a step execution of a job execution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<JobExecutionInner>> getWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        String stepName) {
        final String apiVersion = "2017-03-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            resourceGroupName,
                            serverName,
                            jobAgentName,
                            jobName,
                            jobExecutionId,
                            stepName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a step execution of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The unique id of the job execution.
     * @param stepName The name of the step.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a step execution of a job execution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobExecutionInner> getAsync(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        String stepName) {
        return getWithResponseAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId, stepName)
            .flatMap(
                (SimpleResponse<JobExecutionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a step execution of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The unique id of the job execution.
     * @param stepName The name of the step.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a step execution of a job execution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobExecutionInner get(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        UUID jobExecutionId,
        String stepName) {
        return getAsync(resourceGroupName, serverName, jobAgentName, jobName, jobExecutionId, stepName).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of job executions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<JobExecutionInner>> listByJobExecutionNextSinglePageAsync(String nextLink) {
        return FluxUtil
            .withContext(context -> service.listByJobExecutionNext(nextLink, context))
            .<PagedResponse<JobExecutionInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }
}