package Managers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import BungeeTokens.BungeeTokens.BungeeTokens;

public class TokenSQLManager {
	private final BungeeTokens plugin;

	public TokenSQLManager(BungeeTokens plugin) {
		this.plugin = plugin;
}
	

	/*
	* insertNewPlayer(String, int)
	*
	* Insert a new player into the userProfiles table
	* Takes players UUID as a string and how many tokens
	* the player starts with.
	*/
	public void insertNewPlayer(String playerStringUUID, int tokenCount) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = plugin.pool.getConnection();
			ps = conn.prepareStatement(
					"INSERT INTO userProfiles (UUID, tokens) VALUES ('" + playerStringUUID + "', " + tokenCount + ");");
			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			plugin.pool.close(conn, ps, null);
		}

	}
	
	/*
	* addTokens(String, int)
	*
	* Add tokens to a players token count
	*/
	public int addTokens(String playerStringUUID, int addTokenCount) {
		int newTokenCount = getPlayerTokens(playerStringUUID);
		newTokenCount = newTokenCount + addTokenCount;
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = plugin.pool.getConnection();
			ps = conn.prepareStatement(
					"UPDATE userProfiles SET tokens = " + newTokenCount + " WHERE UUID = '" + playerStringUUID + "';");
			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			plugin.pool.close(conn, ps, null);
		}

		return newTokenCount;
	}
	
	/*
	* setTokens(String, int)
	*
	* Set the token count for a player
	*/
	public void setTokens(String playerStringUUID, int setTokenCount) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = plugin.pool.getConnection();
			ps = conn.prepareStatement(
					"UPDATE userProfiles SET tokens = " + setTokenCount + " WHERE UUID = '" + playerStringUUID + "';");
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			plugin.pool.close(conn, ps, null);
		}

	}

	/*
	* getPlayerTokens(String)
	*
	* Returns token count for player
	*/
	public int getPlayerTokens(String playerStringUUID) {
		int tokenCount = 0;
		int i = 0;

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = plugin.pool.getConnection();
			ps = conn.prepareStatement("SELECT * FROM userProfiles WHERE UUID = '" + playerStringUUID + "';");
			ResultSet rs = ps.executeQuery();

			Bukkit.getLogger().info("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
			while (rs.next()) {
				i++;
				tokenCount = rs.getInt("tokens");
			}

			if (i == 0) {
				tokenCount = 0;
				insertNewPlayer(playerStringUUID, tokenCount);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			plugin.pool.close(conn, ps, null);
		}

		return tokenCount;

	}

}
