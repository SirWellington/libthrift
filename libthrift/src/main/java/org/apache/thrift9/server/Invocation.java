package org.apache.thrift9.server;

import org.apache.thrift9.server.AbstractNonblockingServer.FrameBuffer;

/**
 * An Invocation represents a method call that is prepared to execute, given
 * an idle worker thread. It contains the input and output protocols the
 * thread's processor should use to perform the usual Thrift invocation.
 */
class Invocation implements Runnable {
  private final FrameBuffer frameBuffer;

  public Invocation(final FrameBuffer frameBuffer) {
    this.frameBuffer = frameBuffer;
  }

  public void run() {
    frameBuffer.invoke();
  }
}