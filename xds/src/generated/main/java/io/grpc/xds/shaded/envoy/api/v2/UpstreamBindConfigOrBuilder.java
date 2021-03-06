// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/cds.proto

package io.grpc.xds.shaded.envoy.api.v2;

public interface UpstreamBindConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.UpstreamBindConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The address Envoy should bind to when establishing upstream connections.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Address source_address = 1;</code>
   */
  boolean hasSourceAddress();
  /**
   * <pre>
   * The address Envoy should bind to when establishing upstream connections.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Address source_address = 1;</code>
   */
  io.grpc.xds.shaded.envoy.api.v2.core.Address getSourceAddress();
  /**
   * <pre>
   * The address Envoy should bind to when establishing upstream connections.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Address source_address = 1;</code>
   */
  io.grpc.xds.shaded.envoy.api.v2.core.AddressOrBuilder getSourceAddressOrBuilder();
}
