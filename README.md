[![](https://jitpack.io/v/RomainStorai/HolobroadcastAPI.svg)](https://jitpack.io/#RomainStorai/HolobroadcastAPI)

Gradle:
```groovy
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
dependencies {
	        implementation 'com.github.RomainStorai:HolobroadcastAPI:v1.10.1'
	}
```
Maven:
```xml

  <repositories>
		  <repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		  </repository>
  </repositories>

```
```xml
	<dependency>
	    <groupId>com.github.RomainStorai</groupId>
	    <artifactId>HolobroadcastAPI</artifactId>
	    <version>v1.10.1</version>
	</dependency>
```



## Usage
```java
// To send hologram to a player, you first have to get the HologramPlayer object of a player.
//Here is how to get the HologramPlayer instance of a player:


//1. Get the instance of HologramPlayersManager
HologramPlayersManager manager = HologramPlayersManager.getInstance();

// 2. Once you have this instance, you can get a player by its Unique ID
Player player; // Your player
HologramPlayer holoPlayer = manager.getHologramPlayerFromUUID(player.getUniqueID());

// 3. When you have the instance of holoPlayer, just play with the methods on it.
holoPlayer.showHUD(null // This allow you to ignore the permissions,
                    "Your text goes here, with all the placeholders etc",
                     400 // Time in ticks (-1 to set the default duration)
                   );
```
