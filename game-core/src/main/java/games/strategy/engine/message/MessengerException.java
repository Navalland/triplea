package games.strategy.engine.message;

/**
 * All methods called on an IRemote or an IChannelSubscribor may throw one of these exceptions.
 */
public class MessengerException extends RuntimeException {
  private static final long serialVersionUID = 1058615494612307887L;

  MessengerException(final String message) {
    super(message);
  }

  MessengerException(final String message, final Throwable cause) {
    super(message, cause);
  }
}
