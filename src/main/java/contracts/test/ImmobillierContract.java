package contracts.test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple3;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.1.
 */
@SuppressWarnings("rawtypes")
public class ImmobillierContract extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b50336000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060038060008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff021916908360038111156100d4576100d3610157565b5b02179055506001600460008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff021916908315150217905550610186565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b612113806101956000396000f3fe608060405234801561001057600080fd5b50600436106101005760003560e01c806374d5e10011610097578063c1d5e84f11610066578063c1d5e84f14610335578063c69d0c1414610365578063e35fe36614610395578063e77c3d83146103c557610100565b806374d5e100146102855780637b855bf0146102b557806396530199146102d35780639be8f2a61461030357610100565b80634c82d0e4116100d35780634c82d0e4146101c55780635d9fb3b2146101f557806362a9f11914610225578063695a34e51461025557610100565b80630a1b10e1146101055780630a48a24f1461013557806332282f8e1461016557806342ba518b14610195575b600080fd5b61011f600480360381019061011a9190611b0e565b6103f7565b60405161012c9190611b56565b60405180910390f35b61014f600480360381019061014a9190611cb7565b610615565b60405161015c9190611d0f565b60405180910390f35b61017f600480360381019061017a9190611b0e565b61065e565b60405161018c9190611b56565b60405180910390f35b6101af60048036038101906101aa9190611d2a565b610810565b6040516101bc9190611b56565b60405180910390f35b6101df60048036038101906101da9190611b0e565b610a3d565b6040516101ec9190611b56565b60405180910390f35b61020f600480360381019061020a9190611d86565b610c5a565b60405161021c9190611b56565b60405180910390f35b61023f600480360381019061023a9190611cb7565b610e8b565b60405161024c9190611b56565b60405180910390f35b61026f600480360381019061026a9190611e11565b6110db565b60405161027c9190611b56565b60405180910390f35b61029f600480360381019061029a9190611b0e565b61120f565b6040516102ac9190611f00565b60405180910390f35b6102bd61122f565b6040516102ca9190611d0f565b60405180910390f35b6102ed60048036038101906102e89190611cb7565b611253565b6040516102fa9190611b56565b60405180910390f35b61031d60048036038101906103189190611cb7565b6113f3565b60405161032c93929190611feb565b60405180910390f35b61034f600480360381019061034a9190611b0e565b6114e8565b60405161035c9190611b56565b60405180910390f35b61037f600480360381019061037a9190611cb7565b611708565b60405161038c9190611b56565b60405180910390f35b6103af60048036038101906103aa9190611b0e565b6118a8565b6040516103bc9190611b56565b60405180910390f35b6103df60048036038101906103da9190611cb7565b6118c8565b6040516103ee93929190611feb565b60405180910390f35b600060038081111561040c5761040b611e89565b5b600360003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff16600381111561046b5761046a611e89565b5b1480156104c15750600460003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff165b6104ca57600080fd5b600060038111156104de576104dd611e89565b5b600360008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff16600381111561053d5761053c611e89565b5b1461054757600080fd5b60001515600460008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff161515146105a457600080fd5b6002600360008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff0219169083600381111561060757610606611e89565b5b021790555060019050919050565b6002818051602081018201805184825260208301602085012081835280955050505050506000915054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b600060038081111561067357610672611e89565b5b600360003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff1660038111156106d2576106d1611e89565b5b1480156107285750600460003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff165b61073157600080fd5b6000600381111561074557610744611e89565b5b600360008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff1660038111156107a4576107a3611e89565b5b14156107af57600080fd5b6001600460008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff02191690831515021790555060019050919050565b6000823373ffffffffffffffffffffffffffffffffffffffff1660018260405161083a9190612065565b908152602001604051809103902060020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff161461088c57600080fd5b82600460008273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff166108e357600080fd5b8373ffffffffffffffffffffffffffffffffffffffff1660018660405161090a9190612065565b908152602001604051809103902060020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141561095d57600080fd5b600073ffffffffffffffffffffffffffffffffffffffff166002866040516109859190612065565b908152602001604051809103902060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16146109d457600080fd5b836002866040516109e59190612065565b908152602001604051809103902060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060019250505092915050565b6000600380811115610a5257610a51611e89565b5b600360003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff166003811115610ab157610ab0611e89565b5b148015610b075750600460003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff165b610b1057600080fd5b60006003811115610b2457610b23611e89565b5b600360008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff166003811115610b8357610b82611e89565b5b14610b8d57600080fd5b60001515600460008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff16151514610bea57600080fd5b60038060008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff02191690836003811115610c4c57610c4b611e89565b5b021790555060019050919050565b600060026003811115610c7057610c6f611e89565b5b600360003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff166003811115610ccf57610cce611e89565b5b10158015610d265750600460003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff165b610d2f57600080fd5b81600460008273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff16610d8657600080fd5b604051806060016040528060016003811115610da557610da4611e89565b5b81526020018581526020018473ffffffffffffffffffffffffffffffffffffffff16815250600186604051610dda9190612065565b908152602001604051809103902060008201518160000160006101000a81548160ff02191690836003811115610e1357610e12611e89565b5b02179055506020820151816001019080519060200190610e349291906119f9565b5060408201518160020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555090505060019150509392505050565b6000600380811115610ea057610e9f611e89565b5b600360003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff166003811115610eff57610efe611e89565b5b148015610f555750600460003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff165b610f5e57600080fd5b600073ffffffffffffffffffffffffffffffffffffffff16600283604051610f869190612065565b908152602001604051809103902060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff161415610fd657600080fd5b600282604051610fe69190612065565b908152602001604051809103902060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff166001836040516110259190612065565b908152602001604051809103902060020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060006002836040516110869190612065565b908152602001604051809103902060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060019050919050565b6000823373ffffffffffffffffffffffffffffffffffffffff166001826040516111059190612065565b908152602001604051809103902060020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff161461115757600080fd5b600073ffffffffffffffffffffffffffffffffffffffff1660028560405161117f9190612065565b908152602001604051809103902060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16146111ce57600080fd5b826001856040516111df9190612065565b908152602001604051809103902060010190805190602001906112039291906119f9565b50600191505092915050565b60036020528060005260406000206000915054906101000a900460ff1681565b60008054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b600060038081111561126857611267611e89565b5b600360003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff1660038111156112c7576112c6611e89565b5b14801561131d5750600460003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff165b61132657600080fd5b3373ffffffffffffffffffffffffffffffffffffffff1660018360405161134d9190612065565b908152602001604051809103902060020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614156113a057600080fd5b60026001836040516113b29190612065565b908152602001604051809103902060000160006101000a81548160ff021916908360038111156113e5576113e4611e89565b5b021790555060019050919050565b6001818051602081018201805184825260208301602085012081835280955050505050506000915090508060000160009054906101000a900460ff169080600101805461143f906120ab565b80601f016020809104026020016040519081016040528092919081815260200182805461146b906120ab565b80156114b85780601f1061148d576101008083540402835291602001916114b8565b820191906000526020600020905b81548152906001019060200180831161149b57829003601f168201915b5050505050908060020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16905083565b6000600260038111156114fe576114fd611e89565b5b600360003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff16600381111561155d5761155c611e89565b5b101580156115b45750600460003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff165b6115bd57600080fd5b600060038111156115d1576115d0611e89565b5b600360008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff1660038111156116305761162f611e89565b5b1461163a57600080fd5b60001515600460008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff1615151461169757600080fd5b6001600360008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff021916908360038111156116fa576116f9611e89565b5b021790555060019050919050565b600060038081111561171d5761171c611e89565b5b600360003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff16600381111561177c5761177b611e89565b5b1480156117d25750600460003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff165b6117db57600080fd5b3373ffffffffffffffffffffffffffffffffffffffff166001836040516118029190612065565b908152602001604051809103902060020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141561185557600080fd5b60036001836040516118679190612065565b908152602001604051809103902060000160006101000a81548160ff0219169083600381111561189a57611899611e89565b5b021790555060019050919050565b60046020528060005260406000206000915054906101000a900460ff1681565b6000606060006001846040516118de9190612065565b908152602001604051809103902060000160009054906101000a900460ff1660018560405161190d9190612065565b908152602001604051809103902060010160018660405161192e9190612065565b908152602001604051809103902060020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681805461196c906120ab565b80601f0160208091040260200160405190810160405280929190818152602001828054611998906120ab565b80156119e55780601f106119ba576101008083540402835291602001916119e5565b820191906000526020600020905b8154815290600101906020018083116119c857829003601f168201915b505050505091509250925092509193909250565b828054611a05906120ab565b90600052602060002090601f016020900481019282611a275760008555611a6e565b82601f10611a4057805160ff1916838001178555611a6e565b82800160010185558215611a6e579182015b82811115611a6d578251825591602001919060010190611a52565b5b509050611a7b9190611a7f565b5090565b5b80821115611a98576000816000905550600101611a80565b5090565b6000604051905090565b600080fd5b600080fd5b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000611adb82611ab0565b9050919050565b611aeb81611ad0565b8114611af657600080fd5b50565b600081359050611b0881611ae2565b92915050565b600060208284031215611b2457611b23611aa6565b5b6000611b3284828501611af9565b91505092915050565b60008115159050919050565b611b5081611b3b565b82525050565b6000602082019050611b6b6000830184611b47565b92915050565b600080fd5b600080fd5b6000601f19601f8301169050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b611bc482611b7b565b810181811067ffffffffffffffff82111715611be357611be2611b8c565b5b80604052505050565b6000611bf6611a9c565b9050611c028282611bbb565b919050565b600067ffffffffffffffff821115611c2257611c21611b8c565b5b611c2b82611b7b565b9050602081019050919050565b82818337600083830152505050565b6000611c5a611c5584611c07565b611bec565b905082815260208101848484011115611c7657611c75611b76565b5b611c81848285611c38565b509392505050565b600082601f830112611c9e57611c9d611b71565b5b8135611cae848260208601611c47565b91505092915050565b600060208284031215611ccd57611ccc611aa6565b5b600082013567ffffffffffffffff811115611ceb57611cea611aab565b5b611cf784828501611c89565b91505092915050565b611d0981611ad0565b82525050565b6000602082019050611d246000830184611d00565b92915050565b60008060408385031215611d4157611d40611aa6565b5b600083013567ffffffffffffffff811115611d5f57611d5e611aab565b5b611d6b85828601611c89565b9250506020611d7c85828601611af9565b9150509250929050565b600080600060608486031215611d9f57611d9e611aa6565b5b600084013567ffffffffffffffff811115611dbd57611dbc611aab565b5b611dc986828701611c89565b935050602084013567ffffffffffffffff811115611dea57611de9611aab565b5b611df686828701611c89565b9250506040611e0786828701611af9565b9150509250925092565b60008060408385031215611e2857611e27611aa6565b5b600083013567ffffffffffffffff811115611e4657611e45611aab565b5b611e5285828601611c89565b925050602083013567ffffffffffffffff811115611e7357611e72611aab565b5b611e7f85828601611c89565b9150509250929050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602160045260246000fd5b60048110611ec957611ec8611e89565b5b50565b6000819050611eda82611eb8565b919050565b6000611eea82611ecc565b9050919050565b611efa81611edf565b82525050565b6000602082019050611f156000830184611ef1565b92915050565b60048110611f2c57611f2b611e89565b5b50565b6000819050611f3d82611f1b565b919050565b6000611f4d82611f2f565b9050919050565b611f5d81611f42565b82525050565b600081519050919050565b600082825260208201905092915050565b60005b83811015611f9d578082015181840152602081019050611f82565b83811115611fac576000848401525b50505050565b6000611fbd82611f63565b611fc78185611f6e565b9350611fd7818560208601611f7f565b611fe081611b7b565b840191505092915050565b60006060820190506120006000830186611f54565b81810360208301526120128185611fb2565b90506120216040830184611d00565b949350505050565b600081905092915050565b600061203f82611f63565b6120498185612029565b9350612059818560208601611f7f565b80840191505092915050565b60006120718284612034565b915081905092915050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b600060028204905060018216806120c357607f821691505b602082108114156120d7576120d661207c565b5b5091905056fea2646970667358221220c21f7f5e35e35295ebbda3d702aa63012f5e988b5ad23b7cf06306d40c95e16a64736f6c634300080b0033";

    public static final String FUNC_ADDNEWADMIN = "addNewAdmin";

    public static final String FUNC_ADDNEWSUPERADMIN = "addNewSuperAdmin";

    public static final String FUNC_ADDNEWUSER = "addNewUser";

    public static final String FUNC_APPROVECHANGEOWNERSHIP = "approveChangeOwnership";

    public static final String FUNC_APPROVEPROPERTY = "approveProperty";

    public static final String FUNC_APPROVEUSERS = "approveUsers";

    public static final String FUNC_CHANGEOWNERSHIP = "changeOwnership";

    public static final String FUNC_CHANGEVALUE = "changeValue";

    public static final String FUNC_CREATEPROPERTY = "createProperty";

    public static final String FUNC_CREATORADMIN = "creatorAdmin";

    public static final String FUNC_GETPROPERTYDETAILS = "getPropertyDetails";

    public static final String FUNC_PROPOWNERCHANGE = "propOwnerChange";

    public static final String FUNC_PROPERTIES = "properties";

    public static final String FUNC_REJECTPROPERTY = "rejectProperty";

    public static final String FUNC_USERROLES = "userRoles";

    public static final String FUNC_VERIFIEDUSERS = "verifiedUsers";

    @Deprecated
    protected ImmobillierContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected ImmobillierContract(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected ImmobillierContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected ImmobillierContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> addNewAdmin(String _newAdmin) {
        final Function function = new Function(
                FUNC_ADDNEWADMIN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _newAdmin)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> addNewSuperAdmin(String _newSuperAdmin) {
        final Function function = new Function(
                FUNC_ADDNEWSUPERADMIN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _newSuperAdmin)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> addNewUser(String _newUser) {
        final Function function = new Function(
                FUNC_ADDNEWUSER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _newUser)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> approveChangeOwnership(String _propId) {
        final Function function = new Function(
                FUNC_APPROVECHANGEOWNERSHIP, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_propId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> approveProperty(String _propId) {
        final Function function = new Function(
                FUNC_APPROVEPROPERTY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_propId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> approveUsers(String _newUser) {
        final Function function = new Function(
                FUNC_APPROVEUSERS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _newUser)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> changeOwnership(String _propId, String _newOwner) {
        final Function function = new Function(
                FUNC_CHANGEOWNERSHIP, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_propId), 
                new org.web3j.abi.datatypes.Address(160, _newOwner)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> changeValue(String _propId, String _newValue) {
        final Function function = new Function(
                FUNC_CHANGEVALUE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_propId), 
                new org.web3j.abi.datatypes.Utf8String(_newValue)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> createProperty(String _propId, String _value, String _owner) {
        final Function function = new Function(
                FUNC_CREATEPROPERTY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_propId), 
                new org.web3j.abi.datatypes.Utf8String(_value), 
                new org.web3j.abi.datatypes.Address(160, _owner)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> creatorAdmin() {
        final Function function = new Function(FUNC_CREATORADMIN, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Tuple3<BigInteger, String, String>> getPropertyDetails(String _propId) {
        final Function function = new Function(FUNC_GETPROPERTYDETAILS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_propId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Address>() {}));
        return new RemoteFunctionCall<Tuple3<BigInteger, String, String>>(function,
                new Callable<Tuple3<BigInteger, String, String>>() {
                    @Override
                    public Tuple3<BigInteger, String, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<BigInteger, String, String>(
                                (BigInteger) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (String) results.get(2).getValue());
                    }
                });
    }

    public RemoteFunctionCall<String> propOwnerChange(String param0) {
        final Function function = new Function(FUNC_PROPOWNERCHANGE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Tuple3<BigInteger, String, String>> properties(String param0) {
        final Function function = new Function(FUNC_PROPERTIES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Address>() {}));
        return new RemoteFunctionCall<Tuple3<BigInteger, String, String>>(function,
                new Callable<Tuple3<BigInteger, String, String>>() {
                    @Override
                    public Tuple3<BigInteger, String, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<BigInteger, String, String>(
                                (BigInteger) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (String) results.get(2).getValue());
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> rejectProperty(String _propId) {
        final Function function = new Function(
                FUNC_REJECTPROPERTY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_propId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> userRoles(String param0) {
        final Function function = new Function(FUNC_USERROLES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Boolean> verifiedUsers(String param0) {
        final Function function = new Function(FUNC_VERIFIEDUSERS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    @Deprecated
    public static ImmobillierContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ImmobillierContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static ImmobillierContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ImmobillierContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static ImmobillierContract load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new ImmobillierContract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ImmobillierContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new ImmobillierContract(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<ImmobillierContract> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ImmobillierContract.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<ImmobillierContract> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(ImmobillierContract.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ImmobillierContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ImmobillierContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<ImmobillierContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ImmobillierContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
