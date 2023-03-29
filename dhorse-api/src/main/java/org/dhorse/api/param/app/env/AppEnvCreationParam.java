package org.dhorse.api.param.app.env;

import java.io.Serializable;

/**
 * 添加应用环境
 * 
 * @author Dahai
 */
public class AppEnvCreationParam implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 应用编号
	 */
	private String appId;

	/**
	 * 集群编号
	 */
	private String clusterId;

	/**
	 * 部署命名空间名称
	 */
	private String namespaceName;

	/**
	 * 环境名称，如：开发、测试、预发、生产等
	 */
	private String envName;

	/**
	 * 环境标识，如：dev、qa、pl、ol等
	 */
	private String tag;

	/**
	 * 部署序号（值越小越往前）
	 */
	private Integer deploymentOrder;

	/**
	 * 最小副本数
	 */
	private Integer minReplicas;

	/**
	 * 最大副本数
	 */
	private Integer maxReplicas;

	/**
	 * 每副本CPU，单位m
	 */
	private Integer replicaCpu;

	/**
	 * 每副本内存，单位MB
	 */
	private Integer replicaMemory;

	/**
	 * 自动扩容，cpu使用率
	 */
	private Integer autoScalingCpu;

	/**
	 * 自动扩容，内存使用率
	 */
	private Integer autoScalingMemory;

	/**
	 * 事件通知地址，格式如：http(s)://notify_server:port/receive
	 */
	private String eventNofigyUrl;

	/**
	 * 是否需要部署审批，0：否，1：是
	 */
	private Integer requiredDeployApproval;

	/**
	 * 是否需要合并代码，0：否，1：是
	 */
	private Integer requiredMerge;

	/**
	 * 链路追踪状态
	 */
	private Integer traceStatus;

	/**
	 * 链路追踪模板编号
	 */
	private String traceTemplateId;

	/**
	 * 服务端口
	 */
	private Integer servicePort;

	/**
	 * 辅助端口，如：8081,8082
	 */
	private String minorPorts;

	/**
	 * 健康检查路径，端口后的uri，如：/health
	 */
	private String healthPath;

	/**
	 * 环境描述
	 */
	private String description;

	private EnvExtendSpringBootParam extendSpringBootParam;

	private EnvExtendNodeParam extendNodeParam;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getClusterId() {
		return clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public void setDeploymentOrder(Integer deploymentOrder) {
		this.deploymentOrder = deploymentOrder;
	}

	public String getEnvName() {
		return envName;
	}

	public void setEnvName(String envName) {
		this.envName = envName;
	}

	public Integer getDeploymentOrder() {
		return deploymentOrder;
	}

	public Integer getMinReplicas() {
		return minReplicas;
	}

	public void setMinReplicas(Integer minReplicas) {
		this.minReplicas = minReplicas;
	}

	public String getMinorPorts() {
		return minorPorts;
	}

	public void setMinorPorts(String minorPorts) {
		this.minorPorts = minorPorts;
	}

	public String getEventNofigyUrl() {
		return eventNofigyUrl;
	}

	public void setEventNofigyUrl(String eventNofigyUrl) {
		this.eventNofigyUrl = eventNofigyUrl;
	}

	public Integer getMaxReplicas() {
		return maxReplicas;
	}

	public void setMaxReplicas(Integer maxReplicas) {
		this.maxReplicas = maxReplicas;
	}

	public Integer getAutoScalingCpu() {
		return autoScalingCpu;
	}

	public void setAutoScalingCpu(Integer autoScalingCpu) {
		this.autoScalingCpu = autoScalingCpu;
	}

	public Integer getAutoScalingMemory() {
		return autoScalingMemory;
	}

	public void setAutoScalingMemory(Integer autoScalingMemory) {
		this.autoScalingMemory = autoScalingMemory;
	}

	public Integer getReplicaCpu() {
		return replicaCpu;
	}

	public void setReplicaCpu(Integer replicaCpu) {
		this.replicaCpu = replicaCpu;
	}

	public Integer getReplicaMemory() {
		return replicaMemory;
	}

	public void setReplicaMemory(Integer replicaMemory) {
		this.replicaMemory = replicaMemory;
	}

	public Integer getRequiredDeployApproval() {
		return requiredDeployApproval;
	}

	public void setRequiredDeployApproval(Integer requiredDeployApproval) {
		this.requiredDeployApproval = requiredDeployApproval;
	}

	public Integer getRequiredMerge() {
		return requiredMerge;
	}

	public void setRequiredMerge(Integer requiredMerge) {
		this.requiredMerge = requiredMerge;
	}

	public Integer getTraceStatus() {
		return traceStatus;
	}

	public void setTraceStatus(Integer traceStatus) {
		this.traceStatus = traceStatus;
	}

	public String getTraceTemplateId() {
		return traceTemplateId;
	}

	public void setTraceTemplateId(String traceTemplateId) {
		this.traceTemplateId = traceTemplateId;
	}

	public String getNamespaceName() {
		return namespaceName;
	}

	public void setNamespaceName(String namespaceName) {
		this.namespaceName = namespaceName;
	}

	public Integer getServicePort() {
		return servicePort;
	}

	public void setServicePort(Integer servicePort) {
		this.servicePort = servicePort;
	}

	public String getHealthPath() {
		return healthPath;
	}

	public void setHealthPath(String healthPath) {
		this.healthPath = healthPath;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public EnvExtendSpringBootParam getExtendSpringBootParam() {
		return extendSpringBootParam;
	}

	public void setExtendSpringBootParam(EnvExtendSpringBootParam extendSpringBootParam) {
		this.extendSpringBootParam = extendSpringBootParam;
	}

	public EnvExtendNodeParam getExtendNodeParam() {
		return extendNodeParam;
	}

	public void setExtendNodeParam(EnvExtendNodeParam extendNodeParam) {
		this.extendNodeParam = extendNodeParam;
	}

	public static class EnvExtendNodeParam implements Serializable {

		private static final long serialVersionUID = 1L;

		private String ingressHost;

		public String getIngressHost() {
			return ingressHost;
		}

		public void setIngressHost(String ingressHost) {
			this.ingressHost = ingressHost;
		}

	}

	public static class EnvExtendSpringBootParam implements Serializable {

		private static final long serialVersionUID = 1L;

		private Integer traceStatus;

		private String traceTemplateId;

		private String jvmArgs;

		public Integer getTraceStatus() {
			return traceStatus;
		}

		public void setTraceStatus(Integer traceStatus) {
			this.traceStatus = traceStatus;
		}

		public String getTraceTemplateId() {
			return traceTemplateId;
		}

		public void setTraceTemplateId(String traceTemplateId) {
			this.traceTemplateId = traceTemplateId;
		}

		public String getJvmArgs() {
			return jvmArgs;
		}

		public void setJvmArgs(String jvmArgs) {
			this.jvmArgs = jvmArgs;
		}

	}
}