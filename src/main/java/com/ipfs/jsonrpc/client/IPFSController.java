package com.ipfs.jsonrpc.client;


import io.ipfs.api.IPFS;

public class IPFSController {
    IPFS client;

    public void init() {
        try {
            String address = "/dns6/ipfs-api.xdv.digital/tcp/443/https";
            this.client = new IPFS(address);
        }
        catch (Exception e) {
            throw e;
        }
    }
}
