package org.sagebionetworks.common.util.progress;

/**
 * A callback that will notify progress listeners when progress is made.
 *
 */
public interface ProgressCallback {

	/**
	 * Progress listeners are notified as progress is made. Listeners must be
	 * removed when no more progress events are expected.
	 * 
	 * @param listener
	 */
	public void addProgressListener(ProgressListener listener);

	/**
	 * Remove the given progress listener. The given listener will no longer
	 * receive messages.
	 * 
	 * @param listener
	 */
	public void removeProgressListener(ProgressListener listener);


	/**
	 * Indicates whether the callers of this should terminate.
	 * This is set to true when a ProgressListener throws an exception.
	 * @return
	 */
	public boolean runnerShouldTerminate();
	
	/**
	 * Get the lock timeout for the stack in seconds.
	 * @return
	 */
	public long getLockTimeoutSeconds();
}
