# Spring Boot Kitchen-sink

Course [Spring Boot Masterclass](https://amigoscode.com/courses/295939)

## Java on Neovim chad configuration, not virgin intelliJ allowed, otherwise where's the fun? :)

1. LSP: [jdtls](https://github.com/eclipse/eclipse.jdt.ls)
   - Install on neovim through :Mason
   - config: [https://github.com/pavva91/dotfiles/blob/main/.config/nvim/lua/custom/plugins/nvim-jdtls.lua](https://github.com/pavva91/dotfiles/blob/main/.config/nvim/lua/custom/plugins/nvim-jdtls.lua)
   - Update the "path_to_jar" with locally installed version name: [https://github.com/pavva91/dotfiles/blob/main/.config/nvim/lua/custom/plugins/nvim-jdtls.lua#L20](https://github.com/pavva91/dotfiles/blob/main/.config/nvim/lua/custom/plugins/nvim-jdtls.lua#L20)
2. DAP: [java-debug-adapter](https://github.com/microsoft/java-debug)
3. Gradle:

   - Needs Java 17

   ```bash
   sudo pacman -S jre17-openjdk
   archlinux-java set java-17-openjdk
   ```

## Run Application

- ```bash
   ./gradlew bootRun
  ```
