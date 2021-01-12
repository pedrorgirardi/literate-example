# Example Project for Literate

## Guide

* Clone the repository:

    ```
    git clone https://github.com/pedrorgirardi/literate-example
    ```

* Start a REPL (e.g. socket REPL):

    ```
    clj -J"-Dclojure.server.repl={:port,7890,:accept,clojure.core.server/repl}"
    ```

* Open the file `src/dev/clojure/user.clj` in your editor of choice.

* Connect to the appropriate REPL endpoint (for the example invocation above, it is port 7890 on the local machine).

* Evaluate the first `ns` form:

    ```
    (ns user
      (:require [literate.server :as server]
                [literate.client.core :as literate]

                [clojure.java.io :as io]
                [clojure.data.json :as json]))
    ```

* Evaluate the first form within the `comment` block to start the server:

    ```
    (def stop-server (server/run-server {:port 8118}))
    ```

* Open a web browser and navigate to "localhost:8118".  You should see the word "Literate" in the browser window.

* Evaluate the second from within the `comment` block to prepare a convenience function for the rest of the example:

    ```
    (def l (partial literate/view {:url "http://localhost:8118"}))
    ```

* Evaluate each of the remaining forms while observing the results in the web browser.

* Have fun :)
