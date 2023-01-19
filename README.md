# Example of issue

## Compile

```bash
% npx shadow-cljs compile app
shadow-cljs - config: /home/tom/oss/shadow-sandpit/shadow-cljs.edn
[:app] Compiling ...
[:app] Build completed. (57 files, 1 compiled, 1 warnings, 1.74s)

------ WARNING #1 - :infer-warning ---------------------------------------------
 File: /home/tom/oss/shadow-sandpit/src/main/core.cljs:4:3
--------------------------------------------------------------------------------
   1 | (ns core
   2 | (:require [reagent.core :as r]))
   3 | (defn main []
   4 |   (r/with-let [foo (r/atom "bar")]
---------^----------------------------------------------------------------------
 Cannot infer target type in expression (. with-let6173 -generation)
--------------------------------------------------------------------------------
   5 |     (js/console.log @foo))
   6 | )
   7 | (main)
   8 | 
--------------------------------------------------------------------------------
```

## Release

```bash
% npx shadow-cljs release app
shadow-cljs - config: /home/tom/oss/shadow-sandpit/shadow-cljs.edn
[:app] Compiling ...
[:app] Build completed. (56 files, 0 compiled, 0 warnings, 6.04s)
```

Why no warnings with release?
